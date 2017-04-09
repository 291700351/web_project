package com.icelee.pojo.wrapper;

import com.icelee.pojo.bean.custom.AdminCustom;

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

    private AdminCustom adminCustom;


    public AdminCustom getAdminCustom() {
        return adminCustom;
    }

    public void setAdminCustom(AdminCustom adminCustom) {
        this.adminCustom = adminCustom;
    }

    @Override
    public String toString() {
        return "AdminQueryWrapper{" +
                "adminCustom=" + adminCustom +
                '}';
    }
}
