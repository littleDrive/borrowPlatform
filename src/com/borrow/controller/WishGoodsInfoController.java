package com.borrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.borrow.common.pojo.GoodsList;
import com.borrow.pojo.BorrowGoodsInfo;
import com.borrow.pojo.WishGoodsInfo;
import com.borrow.pojo.WishGoodsStatus;
import com.borrow.service.WishGoodsInfoService;

@Controller
@RequestMapping("/wishInfo")
public class WishGoodsInfoController {

	@Autowired 
	private WishGoodsInfoService wishGoodsInfoService;
	
	/*
	 * 查询用户所有的愿望物品
	 * 成功
	 */
	@RequestMapping(value="/getWishByWechatId", method=RequestMethod.POST)
	@ResponseBody
	public GoodsList getWishByWechatId(String wechatId) {
		
		return wishGoodsInfoService.selectWishGoodsByWechat(wechatId);
	}
	
	/*
	 * 根据wishGoods的id获取其状态
	 * 成功
	 */
	@RequestMapping(value="/getWishStatus", method=RequestMethod.POST)
	@ResponseBody
	public WishGoodsStatus getWishStatus(String id) {
		
		return wishGoodsInfoService.selectWishGoodsStatusById(id);
	}
	
	/*
	 * 增加商品
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public String addWishGoods(WishGoodsInfo wishGoodsInfo) {
		
		return wishGoodsInfoService.insertWishGoods(wishGoodsInfo);
	}
}
