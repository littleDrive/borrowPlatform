package com.borrow.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.borrow.common.pojo.GoodsList;
import com.borrow.mapper.WishGoodsInfoMapper;
import com.borrow.mapper.WishGoodsStatusMapper;
import com.borrow.pojo.BorrowGoodsInfo;
import com.borrow.pojo.WishGoodsInfo;
import com.borrow.pojo.WishGoodsInfoExample;
import com.borrow.pojo.WishGoodsInfoExample.Criteria;
import com.borrow.pojo.WishGoodsStatus;
import com.borrow.service.WishGoodsInfoService;


@Service
public class WishGoodsInfoServiceImpl implements WishGoodsInfoService {

	@Autowired 
	private WishGoodsInfoMapper wishGoodsInfoMapper;
	@Autowired
	private WishGoodsStatusMapper wishGoodsStatusMapper;
/*
 * 查询用户所有的愿望物品
 * @see com.borrow.service.WishGoodsInfoService#selectWishGoodsByWechat(java.lang.String)
 */
	@Override
	public GoodsList selectWishGoodsByWechat(String wechatId) {
		
//		创建查询条件
		WishGoodsInfoExample example = new WishGoodsInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andWisherEqualTo(wechatId);
//		查询，返回WishGoods列表
		List<WishGoodsInfo> list = wishGoodsInfoMapper.selectByExample(example);
//		把查询结果放入Goodlist
		GoodsList goodsList = new GoodsList();
		goodsList.setCount(list.size());
		goodsList.setList(list);
		return goodsList;
	}

	/*
	 * 通过的愿望物品编号获取愿望物品状态信息
	 * @see com.borrow.service.WishGoodsInfoService#selectWishGoodsStatusById(java.lang.String)
	 */
	@Override
	public WishGoodsStatus selectWishGoodsStatusById(String id) {
//		查询
		WishGoodsStatus wishGoodsStatus = wishGoodsStatusMapper.selectByPrimaryKey(id);
		
		return wishGoodsStatus;
	}

	@Override
	public String insertWishGoods(WishGoodsInfo wishGoodsInfo) {
//		不全wishGoods信息
		wishGoodsInfo.setId(UUID.randomUUID().toString());
		wishGoodsInfo.setStatus((byte)0);
		
		wishGoodsInfoMapper.insert(wishGoodsInfo);
		return "ok";
	}
	
	
}
