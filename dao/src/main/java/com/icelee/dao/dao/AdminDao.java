package com.icelee.dao.dao;

import com.icelee.dao.base.BaseDao;
import com.icelee.pojo.bean.Admin;
import com.icelee.pojo.wrapper.AdminQueryWrapper;
import org.springframework.stereotype.Repository;

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
@Repository
public interface AdminDao extends BaseDao<Admin> {

    /**
     * 通过用户名和密码获取数据库的数据
     */
    Admin findByUsernameAndPassword(AdminQueryWrapper adminQueryWrapper);

}
