package com.borrow.service.impl;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.borrow.common.pojo.ResponseData;
import com.borrow.mapper.UserMapper;
import com.borrow.pojo.User;
import com.borrow.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	/*
	 * 查询用户信息
	 * 
	 * @see com.borrow.service.UserService#selectUserById(java.lang.String)
	 */
	@Override
	public User selectUserById(String wechatId) {

		return userMapper.selectByPrimaryKey(wechatId);

	}

	/*
	 * 根据wechatId，修改用户信息
	 * 
	 * @see com.borrow.service.UserService#updataUser(com.borrow.pojo.User)
	 */
	@Override
	public User updataUser(User user) {
//		将user中不为空的属性全部更新

		userMapper.updateByPrimaryKeySelective(user);
		User updateUser = userMapper.selectByPrimaryKey(user.getWechatId());
		return updateUser;

	}

	@Override
	public void insertUser(String wechatId, String name) {

		User user = new User();
		user.setWechatId(wechatId);
		user.setName(name);
		user.setAllBorrowNum(0);
		user.setBorrowNum(0);
		user.setCredit((byte) 1);
		user.setCwgNum(0);
		user.setWgNum(0);
		userMapper.insert(user);
	}

}
