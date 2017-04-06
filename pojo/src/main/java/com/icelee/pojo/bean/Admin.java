package com.icelee.pojo.bean;

import java.util.Date;

/**
 * ============================================================
 * <p>
 * 版 权 ： IceLee个人开发学习
 * <p>
 * 作 者 : IceLee
 * <p>
 * 版 本 ： 1.0
 * <p>
 * 创建日期 ：2016年6月9日
 * <p>
 * 描 述 ：
 * <p>
 * ============================================================
 **/
public class Admin {
    private long id;//` CHAR(32) GENERATED ALWAYS AS () VIRTUAL COMMENT '主键ID，32位长度字符串，数据库自动生成',
    private String username;//` VARCHAR(255) NOT NULL COMMENT '登录用户名',
    private String password;//` VARCHAR(255) NOT NULL COMMENT '登录密码',
    private String realname;//` VARCHAR(45) NOT NULL COMMENT '真实姓名',
    private int sex;//` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '性别 0：男、1：女',
    private String mobile;//` VARCHAR(45) NULL COMMENT '手机号码',
    private String email;//` VARCHAR(255) NULL COMMENT '邮箱',
    private Date createTime;//` MEDIUMTEXT NOT NULL COMMENT '创建时间',
    private Date updateTime;//` MEDIUMTEXT NOT NULL COMMENT '更新时间',
    private long createBy;//` CHAR(32) NOT NULL COMMENT '创建者Id',

    //===Desc:Geter And Setter====================================================================================

    public long getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(long createBy) {
        this.createBy = createBy;
    }

    //===Desc:toString ====================================================================================

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", sex=" + sex +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}
