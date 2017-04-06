package com.icelee.dao.impl;

import com.icelee.pojo.bean.Admin;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

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
public class AdminImplTest {
    private ApplicationContext context;


    private String username = "IceLee";
    private String password = "99233123";
    private String realname = "李彬";
    private int sex = 0;
    private String mobile = "18982071407";
    private String email = "lb291700351@live.cn";
    private Date createTime = new Date();
    private Date updateTime = new Date();
    private long createBy = 1;

    @Before
    public void before() throws Exception {
        context =
                new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");

    }

    @Test
    public void save() throws Exception {
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setRealname(realname);
        admin.setSex(sex);
        admin.setMobile(mobile);
        admin.setEmail(email);
        admin.setCreateTime(createTime);
        admin.setUpdateTime(updateTime);
        admin.setCreateBy(createBy);
        AdminImpl impl = context.getBean(AdminImpl.class);
        impl.save(admin);
        System.out.println(admin.getId());
        System.out.println(admin);

    }


    @Test
    public void deleteById() {
        context.getBean(AdminImpl.class).deleteById(3);

    }

    @Test
    public void update() {
        Admin admin = context.getBean(AdminImpl.class).findById(4);

        admin.setUsername(username);
        admin.setPassword(password);
        admin.setRealname(realname);
        admin.setSex(sex);
        admin.setMobile(mobile);
        admin.setEmail(email);
        admin.setUpdateTime(updateTime);
        admin.setCreateBy(createBy);
//
        context.getBean(AdminImpl.class).update(admin);
    }

    @Test
    public void findById() {
        Admin admin = context.getBean(AdminImpl.class).findById(4);
        System.out.println(admin);
    }


    @Test
    public void findAll() {
        List<Admin> all = context.getBean(AdminImpl.class).findAll();
        System.out.println(all);
    }

    @Test
    public void getCount() {
        long count = context.getBean(AdminImpl.class).getCount();
        System.out.println(count);

    }

    @Test
    public void findByUsernameAndPassword() {
        Admin admin = context.getBean(AdminImpl.class).findByUsernameAndPassword(username, password);
        System.out.println(admin);

    }
}