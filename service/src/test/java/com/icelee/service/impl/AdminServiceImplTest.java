package com.icelee.service.impl;

import com.icelee.pojo.bean.Admin;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

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
public class AdminServiceImplTest {

    private ApplicationContext context;

    @Before
    public void before() throws Exception {
        context = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml");
    }

    @Test
    public void login() throws Exception {
        String username = "IceLee";
        String password = "99233123";

        Admin admin = context.getBean(AdminServiceImpl.class).login(username, password);
        System.out.println(admin);

    }

}