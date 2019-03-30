package com.borrow.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.borrow.common.pojo.GoodsList;
import com.borrow.common.pojo.ResponseData;
import com.borrow.common.utils.FtpUtil;
import com.borrow.common.utils.IDUtils;
import com.borrow.mapper.BorrowGoodsInfoMapper;
import com.borrow.mapper.BorrowGoodsStatusMapper;
import com.borrow.mapper.UserMapper;
import com.borrow.pojo.BorrowGoodsInfo;
import com.borrow.pojo.BorrowGoodsInfoExample;
import com.borrow.pojo.WishGoodsInfo;
import com.borrow.pojo.WishGoodsInfoExample;
import com.borrow.pojo.BorrowGoodsInfoExample.Criteria;
import com.borrow.pojo.BorrowGoodsStatus;
import com.borrow.pojo.User;
import com.borrow.service.BorrowGoodsInfoService;

@Service("borrowGoodsInfoService")
public class BorrowGoodsInfoServiceImpl implements BorrowGoodsInfoService {

	@Autowired
	private BorrowGoodsInfoMapper borrowGoodsInfoMapper;

	@Autowired
	private BorrowGoodsStatusMapper borrowGoodsStatusMapper;
	
	@Autowired
	private UserMapper userMapper;
	
//	根据物品名字查询，返回一组物品信息
	@Override
	public GoodsList selectBorrowGoodsInfoByName(String name) {
		
//		创建查询条件
		BorrowGoodsInfoExample example = new BorrowGoodsInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike("%"+name+"%");
//		根据查询条件查询并返回结果
		List<BorrowGoodsInfo> list = borrowGoodsInfoMapper.selectByExample(example);
//		把查询结果放入Goodlist
		GoodsList goodsList = new GoodsList();
		goodsList.setCount(list.size());
		goodsList.setList(list);
		return goodsList;
	}

	/*
	 * 查询用户借用的物品
	 * @see com.borrow.service.BorrowGoodsInfoService#selectBorrowGoodsInfoByWechat(java.lang.String)
	 */
	@Override
	public GoodsList selectBorrowGoodsInfoByWechat(String wechatId) {
		
//		创建查询条件
		BorrowGoodsInfoExample example = new BorrowGoodsInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andOwnerEqualTo(wechatId);
//		查询，返回WishGoods列表
		List<BorrowGoodsInfo> list = borrowGoodsInfoMapper.selectByExample(example);
//		把查询结果放入Goodlist
		GoodsList goodsList = new GoodsList();
		goodsList.setCount(list.size());
		goodsList.setList(list);
		return goodsList;
	}

	/*
	 *根据id查看borrowGoods状态
	 * @see com.borrow.service.BorrowGoodsInfoService#selectBorrowGoodsStatusById(java.lang.String)
	 */
	@Override
	public BorrowGoodsStatus selectBorrowGoodsStatusById(String id) {
		
		BorrowGoodsStatus borrowGoodsStatus = borrowGoodsStatusMapper.selectByPrimaryKey(id);
		return borrowGoodsStatus;
		
	}

	/*
	 * 添加BorrowGoods
	 * @see com.borrow.service.BorrowGoodsInfoService#insertBorrowGoods(com.borrow.pojo.BorrowGoodsInfo)
	 */
	@Override
	public String insertBorrowGoods(MultipartFile file, BorrowGoodsInfo borrowGoodsInfo) {
		
//		判断是否有上传图片图片
		if (file==null && file.isEmpty()) {
//			图片上传失败
			return "error";
		} else {
//			把图片上传到服务器，并返回图片url
			//取文件扩展名
			String originalFilename = file.getOriginalFilename();
			String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
			//生成新文件名
			//可以是时间+随机数生成文件名
			String imageName = IDUtils.genImageName();
			//把图片上传到ftp服务器（图片服务器）
			//文件在服务器的存放路径，应该使用日期分隔的目录结构
			DateTime dateTime = new DateTime();
			String filePath = dateTime.toString("/yyyy/MM/dd");
			try {
				FtpUtil.uploadFile("8.9.31.166", 21, "ftpuser", "13724199470", 
						"/home/ftpuser/www/images", filePath, imageName + ext, file.getInputStream());
				borrowGoodsInfo.setPicture("http://8.9.31.166/images" + filePath + "/" + imageName + ext);
			} catch (Exception e) {
				e.printStackTrace();
				return "error";
			}
			//返回结果，生成一个可以访问到图片的url返回
		}
//		补全商品信息
		borrowGoodsInfo.setId(UUID.randomUUID().toString());
		borrowGoodsInfo.setStatus((byte) 0);
//		把商品信息添加到BorrowGoods
		borrowGoodsInfoMapper.insert(borrowGoodsInfo);
		return "success";
	}

/*
 * 根据id借用商品
 * @see com.borrow.service.BorrowGoodsInfoService#borrowBorrowGoods(java.lang.String)
 */
	@Override
	public String borrowBorrowGoods(String id, String wechatId) {
//		把物品改为借用状态（status改为1）
		BorrowGoodsInfo borrowGoodsInfo = new BorrowGoodsInfo();
		borrowGoodsInfo.setStatus((byte)1);
		borrowGoodsInfo.setId(id);


//		只更新不为空的值
		borrowGoodsInfoMapper.updateByPrimaryKeySelective(borrowGoodsInfo);

		//		同时创建一条物品的状态信息表
		BorrowGoodsStatus borrowGoodsStatus = new BorrowGoodsStatus();
		borrowGoodsStatus.setBorrower(wechatId);
//		设置时间
		Calendar curr = Calendar.getInstance();
		Date borrowDate=curr.getTime();
//		借用期限为一周
		curr.set(Calendar.DAY_OF_MONTH,curr.get(Calendar.DAY_OF_MONTH)+7);
		Date limitDate = curr.getTime();
		borrowGoodsStatus.setBorrowTime(borrowDate);
		borrowGoodsStatus.setLimitTime(limitDate);
		borrowGoodsStatus.setStatus((byte)1);
//		与物品id一致
		borrowGoodsStatus.setId(borrowGoodsInfo.getId());
		borrowGoodsStatusMapper.insert(borrowGoodsStatus);
		
//		更新用户信息
		User user = userMapper.selectByPrimaryKey(wechatId);
		user.setBorrowNum(user.getBorrowNum()+1);
		user.setAllBorrowNum(user.getAllBorrowNum()+1);
		userMapper.updateByPrimaryKey(user);
		
		return "ok";
	}
	
}
