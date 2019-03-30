package com.borrow.pojo;

import java.util.Date;
/*
 * 物品租借状态表
 */
public class BorrowGoodsStatus {
	
	//租借的物品编号
    private String id;

    //借用者
    private String borrower;

    //借用时间 
    private Date borrowTime;

    //借用期限
    private Date limitTime;

    //状态(是否已归还)
    private Byte status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower == null ? null : borrower.trim();
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Date getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}