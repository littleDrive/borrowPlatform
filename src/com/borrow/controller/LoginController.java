package com.borrow.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.borrow.common.pojo.ResponseData;
import com.borrow.common.pojo.WxIdentity;
import com.borrow.common.utils.HttpClientUtil;
import com.borrow.common.utils.JsonUtils;
import com.borrow.pojo.User;
import com.borrow.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	@ResponseBody
	public ResponseData doLogin (HttpServletRequest request, String code) {
		
		
//		根据code获取用户openid和session_key
/*
 * 		GET https://api.weixin.qq.com/sns/jscode2session?
 * 微信小程序的appid
 * 			appid=APPID&
 * 微信小程序的密钥
 * 			secret=SECRET&
 * 授权登陆的code，只能用一次
 * 			js_code=JSCODE&
 * 授权类型，此处只需填写 authorization_code
 * 			grant_type=authorization_code
 */
		System.out.println("---------------------------------code = " + code);
		
		String url = "https://api.weixin.qq.com/sns/jscode2session";
//		设置参数
		Map<String, String> map = new HashMap<>();
		map.put("appid", "wx8a87266f30a355da");
		map.put("secret", "17c9e15ec9aaa9fdd308294a72244fd6");
		map.put("js_code", code);
		map.put("grant_type", "authorization_code");
		
//		获取返回的json数据
		String json = HttpClientUtil.doGet(url, map);
		System.out.println("--------------------------");
		System.out.println("json =" + json);
		WxIdentity wxIdentity = JsonUtils.jsonToPojo(json, WxIdentity.class);
		
		User user = userService.selectUserById(wxIdentity.getOpenid());
//		获取到openid和session_key
		String openid = wxIdentity.getOpenid();
		String session_key = wxIdentity.getSession_key();
//		若用户不存在，保存到数据库
		if (user == null) {
			
//			随机生成一个用户名
			String wechatId = openid;
			String name = UUID.randomUUID().toString();
			userService.insertUser(wechatId, name);
		}
		
//		把sessin_key存入session
		String skey = UUID.randomUUID().toString();
		
		HttpSession session = request.getSession();
		session.setAttribute(skey, session_key);
		session.setAttribute("openid", openid);
		
//		把数据封装到responseData中返回
		ResponseData responseData = new ResponseData();
		responseData.setStatus("success");
		Map<String, String> result = new HashMap<>();
		result.put("openid", openid);
		result.put("skey", skey);
		responseData.setResult(result);
		return responseData;
	}

}
