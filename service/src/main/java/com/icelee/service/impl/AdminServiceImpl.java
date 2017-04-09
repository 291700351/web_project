package com.icelee.service.impl;

import com.icelee.dao.dao.AdminDao;
import com.icelee.pojo.bean.Admin;
import com.icelee.pojo.bean.custom.AdminCustom;
import com.icelee.pojo.wrapper.AdminQueryWrapper;
import com.icelee.service.AdminService;
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
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;


    public Admin login(String username, String password) {
        AdminQueryWrapper wrapper = new AdminQueryWrapper();
        AdminCustom adminCustom = new AdminCustom();
        adminCustom.setUsername(username);
        adminCustom.setPassword(password);
        wrapper.setAdminCustom(adminCustom);
        return adminDao.findByUsernameAndPassword(wrapper);
    }


}
