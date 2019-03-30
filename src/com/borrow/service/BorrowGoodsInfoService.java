package com.borrow.service;

import org.springframework.web.multipart.MultipartFile;

import com.borrow.common.pojo.GoodsList;
import com.borrow.common.pojo.ResponseData;
import com.borrow.pojo.BorrowGoodsInfo;
import com.borrow.pojo.BorrowGoodsStatus;
import com.borrow.pojo.WishGoodsStatus;

public interface BorrowGoodsInfoService {
	
	//根据物品名字模糊查询物品
	GoodsList selectBorrowGoodsInfoByName(String name);
	
	//查询用户拥有的borrowGoods
	GoodsList selectBorrowGoodsInfoByWechat(String wechatId);
	
//	5.通过BorrowGoods的编号获取租界物品的状态信息
	public BorrowGoodsStatus selectBorrowGoodsStatusById(String id);
	
//	7.添加BorrowGoods
	public String insertBorrowGoods(MultipartFile file, BorrowGoodsInfo borrowGoodsInfo);

//	借用商品
	public String borrowBorrowGoods(String id, String wechatId);
}
