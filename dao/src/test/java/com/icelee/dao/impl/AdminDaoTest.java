package com.icelee.dao.impl;

import com.icelee.dao.dao.AdminDao;
import com.icelee.pojo.bean.Admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;
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
public class AdminDaoTest {
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
        AdminDao impl = context.getBean(AdminDao.class);
        impl.save(admin);
        System.out.println(admin.getId());
        System.out.println(admin);

    }


    @Test
    public void deleteById() {
        context.getBean(AdminDao.class).deleteById(3);

    }

    @Test
    public void update() {
        Admin admin = context.getBean(AdminDao.class).findById(4);

        admin.setUsername(username);
        admin.setPassword(password);
        admin.setRealname(realname);
        admin.setSex(sex);
        admin.setMobile(mobile);
        admin.setEmail(email);
        admin.setUpdateTime(updateTime);
        admin.setCreateBy(createBy);
//
        context.getBean(AdminDao.class).update(admin);
    }

    @Test
    public void findById() {
        Admin admin = context.getBean(AdminDao.class).findById(4);
        System.out.println(admin);
    }


    @Test
    public void findAll() {
        List<Admin> all = context.getBean(AdminDao.class).findAll();
        System.out.println(all);
    }

    @Test
    public void getCount() throws IOException {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");

        long count = sqlSessionFactory.openSession().getMapper(AdminDao.class).getCount();
//        = sqlSessionFactory.openSession().getMapper(AdminDao.class).getCount();
        System.out.println(count);
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
//        Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
//        //获取SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        System.out.println(sqlSessionFactory);
//        SqlSession session = sqlSessionFactory.openSession();
//        System.out.println(session);
//
//        AdminDao mapper = session.getMapper(AdminDao.class);
//        System.out.println(mapper.getCount());

    }

    @Test
    public void findByUsernameAndPassword() {
//        Admin admin = context.getBean(AdminDao.class).findByUsernameAndPassword(username, password);
//        System.out.println(admin);

    }
}