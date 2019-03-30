package com.borrow.pojo;

import java.util.Date;
/*
 * 愿望的物品状态表
 */
public class WishGoodsStatus {
	
	//愿望的物品编号
    private String id;

    //实现者
    private String implementor;

    //实现时间 
    private Date implementorTime;

    //借用期限
    private Date limitTime;
    //状态
    private Byte status;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getImplementor() {
        return implementor;
    }

    public void setImplementor(String implementor) {
        this.implementor = implementor == null ? null : implementor.trim();
    }

    public Date getImplementorTime() {
        return implementorTime;
    }

    public void setImplementorTime(Date implementorTime) {
        this.implementorTime = implementorTime;
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