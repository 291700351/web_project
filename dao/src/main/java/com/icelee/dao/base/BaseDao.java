package com.icelee.dao.base;

import java.util.List;

/**
 * 项目名称：web_project<br>
 * 作者：Ice<br>
 * 邮箱： lb291700351@live.cn<br>
 * 时间：2017/4/5 15:40<br>
 * 类描述：<br>
 */
public interface BaseDao<T> {
    /**
     * 向数据库中添加一条数据
     */
    void save(T t);

    /**
     * 通过主键Id删除数据库中的一条数据
     */
    void deleteById(long id);

    /**
     * 更新数据库中的一条数据
     */
    void update(T t);
    //===Desc:====================================================================================

    /**
     * 通过主键Id获取数据库中的数据
     */
    T findById(long id);

    /**
     * 获取数据库中的所有数据
     */
    List<T> findAll();

    /** 获取总数*/
    long getCount();
}
