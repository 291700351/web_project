package com.icelee.service.impl;

import com.icelee.dao.impl.AdminImpl;
import com.icelee.pojo.bean.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class AdminServiceImpl {

    @Autowired
    private AdminImpl dao;


    public Admin login(String user, String password) {
        return dao.findByUsernameAndPassword(user, password);
    }


}
