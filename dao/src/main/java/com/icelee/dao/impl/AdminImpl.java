//package com.icelee.dao.impl;
//
////import com.icelee.dao.base.BaseImpl;
//import com.icelee.dao.dao.AdminDao;
//import com.icelee.pojo.bean.Admin;
//import com.icelee.pojo.wrapper.AdminQueryWrapper;
//import org.springframework.stereotype.Repository;
//
///**
// * ============================================================
// * <p>
// * 版 权 ： IceLee个人开发学习
// * <p>
// * 作 者 : IceLee
// * <p>
// * 版 本 ： 1.0
// * <p>
// * 创建日期 ：2016年6月9日
// * <p>
// * 描 述 ：
// * <p>
// * ============================================================
// **/
//
//public class AdminImpl extends BaseImpl<Admin> implements AdminDao {
//
//
//    @Override
//    public Admin findByUsernameAndPassword(String username, String password) {
////        使用包装类进行登录
//        AdminQueryWrapper wrapper = new AdminQueryWrapper();
//        wrapper.setUsername(username);
//        wrapper.setPassword(password);
//        return sqlSession.selectOne(getClass().getName() + ".findByUsernameAndPassword", wrapper);
//    }
//}
