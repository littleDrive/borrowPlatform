package com.borrow.service;

import com.borrow.common.pojo.ResponseData;
import com.borrow.pojo.User;

/*
 * 用于对用户信息的操作接口
 */
public interface UserService {
	
	//6.根据wechatId，修改用户信息,返回修改后的用户
	public User updataUser(User user);
	
	
	//8.查询用户的个人信息
	public User selectUserById(String wechatId);
	
//	增加一个用户
	public void insertUser(String wechatId, String name);
}
