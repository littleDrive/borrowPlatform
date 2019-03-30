package com.borrow.common.pojo;

import java.util.Map;

/*
 * 作为相应前端请求状态的对象
 */
public class ResponseData {
	
//	相应状态（OK/ERROR）
	private String status;

	private Map<String, String> result;
	
	
	public Map<String, String> getResult() {
		return result;
	}

	public void setResult(Map<String, String> result) {
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
