package com.borrow.pojo;
/*
 * 用户表
 */
public class User {
	
	//微信号
    private String wechatId;
    
    //微信名
    private String name;

    //愿望物品个数
    private Integer wgNum;

    //实现愿望物品个数
    private Integer cwgNum;

    //现租借个数
    private Integer borrowNum;

    //总租借个数
    private Integer allBorrowNum;

    //地址
    private String address;

    //信用级别：优/差
    private Byte credit;

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getWgNum() {
        return wgNum;
    }

    public void setWgNum(Integer wgNum) {
        this.wgNum = wgNum;
    }

    public Integer getCwgNum() {
        return cwgNum;
    }

    public void setCwgNum(Integer cwgNum) {
        this.cwgNum = cwgNum;
    }

    public Integer getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(Integer borrowNum) {
        this.borrowNum = borrowNum;
    }

    public Integer getAllBorrowNum() {
        return allBorrowNum;
    }

    public void setAllBorrowNum(Integer allBorrowNum) {
        this.allBorrowNum = allBorrowNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getCredit() {
        return credit;
    }

    public void setCredit(Byte credit) {
        this.credit = credit;
    }
}