package com.borrow.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.borrow.common.pojo.ResponseData;
import com.borrow.pojo.User;
import com.borrow.service.UserService;

/*
 * xxx表示url=http://localhost:8080/borrowPlatform02
 * 
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserService userService;
	
	/*
	 * 根据wechatId查询用户信息
	 * url=xxx/userInfo/getUserInfo?wechatId=test1
	 * 返回的的json数据user={"wechatId":"test1","name":"test1","wgNum":0,"cwgNum":0,"borrowNum":0,"allBorrowNum":0,"address":"533","credit":1}
	 */
	@RequestMapping(value="/getUserInfo", method=RequestMethod.POST)
	@ResponseBody
	public User getUserInfo(String wechatId) {	
		
		User user = userService.selectUserById(wechatId);
		return user;
	}
	
	/*
	 * 更新用户信息
	 * url=xxx/userInfo/updataUesr
	 * 插入的数据格式user={"wechatId":"test1","address":"533"}
	 */
	@RequestMapping("/updataUserInfo")
	@ResponseBody
	public User updataUser(User user) {
		
		return userService.updataUser(user);
	}
}
