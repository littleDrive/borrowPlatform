package com.borrow.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.borrow.common.pojo.GoodsList;
import com.borrow.common.pojo.ResponseData;
import com.borrow.pojo.BorrowGoodsInfo;
import com.borrow.pojo.BorrowGoodsStatus;
import com.borrow.service.BorrowGoodsInfoService;

/*
 * 物品信息的handler
 * borrowGoodsInfo的属性
 * 
 */
@Controller
@RequestMapping("/borrowInfo")
public class BorrowGoodsInfoController {

	@Autowired
	private BorrowGoodsInfoService borrowGoodsInfoService;
	
	/*
	 * 根据物品名字查询物品
	 * 成功
	 */
	@RequestMapping(value="/getBorrowByName", method=RequestMethod.POST)
	@ResponseBody
	public GoodsList getBorrowByName(String name) {
		
		GoodsList goodsList = borrowGoodsInfoService.selectBorrowGoodsInfoByName(name);
		return goodsList;
	}
	
	/*
	 * 根据wechatId查询用户拥有的borrowGoods
	 */
	@RequestMapping(value="/getBorrowByWechatId", method=RequestMethod.POST)
	@ResponseBody
	public GoodsList getBorrowByWechatId(String wechatId) {
		
		return borrowGoodsInfoService.selectBorrowGoodsInfoByWechat(wechatId);
	}
	
	/*
	 * 5.通过租界物品的编号获取租界物品的状态信息
	 */
	@RequestMapping(value="/getBorrowStatusInfo", method=RequestMethod.POST)
	@ResponseBody
	public BorrowGoodsStatus getBorrowStatusInfo(String id) {
		
		return borrowGoodsInfoService.selectBorrowGoodsStatusById(id);
	}
	
	/*
	 * 增加商品
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public String addBorrowGoods(MultipartFile file, BorrowGoodsInfo borrowGoodsInfo) {
		
		return borrowGoodsInfoService.insertBorrowGoods(file, borrowGoodsInfo);
	}
	
	/*
	 * 借用borrowGoods
	 */
	@RequestMapping(value="/borrow", method=RequestMethod.POST)
	@ResponseBody
	public String borrowBorrowGoods(String id, String wechatId) {
		
		return borrowGoodsInfoService.borrowBorrowGoods(id, wechatId);
	}
}
