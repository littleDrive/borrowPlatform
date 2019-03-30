package com.borrow.common.pojo;

public class WxIdentity {

//	微信小程序身份认证返回的数据
	
	private String openid;
	private String session_key;
	
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getSession_key() {
		return session_key;
	}
	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}
	
}
