package com.icelee.pojo.wrapper;

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
public class AdminQueryWrapper {

    private String username;

    private String password;


    //===Desc:====================================================================================


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

    //===Desc:====================================================================================

    @Override
    public String toString() {
        return "AdminQueryWrapper{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
