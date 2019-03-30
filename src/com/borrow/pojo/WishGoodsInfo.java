package com.borrow.pojo;

/*
 * 愿望的物品信息表
 */
public class WishGoodsInfo {
	//编号
    private String id;

    //名字
    private String name;

    //图片 
    private String picture;

    //类别 
    private String classes;

    //愿主
    private String wisher;

    //状态
    private Byte status;

    //功能描述
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getWisher() {
        return wisher;
    }

    public void setWisher(String wisher) {
        this.wisher = wisher == null ? null : wisher.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}