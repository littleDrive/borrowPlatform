package com.borrow.service;

import com.borrow.common.pojo.GoodsList;
import com.borrow.pojo.BorrowGoodsInfo;
import com.borrow.pojo.WishGoodsInfo;
import com.borrow.pojo.WishGoodsStatus;

public interface WishGoodsInfoService {

	
//	 查询用户所有的愿望物品
	 public GoodsList selectWishGoodsByWechat(String wechatId);
	
//	 通过wishGoods的编号获取wishGoodsStatus的状态信息
	 public WishGoodsStatus selectWishGoodsStatusById(String id);
	 
//	 增加愿望物品
	 public String insertWishGoods(WishGoodsInfo wishGoodsInfo);
}
