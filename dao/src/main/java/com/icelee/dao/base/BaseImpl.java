//package com.icelee.dao.base;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
///**
// * 项目名称：web_project<br>
// * 作者：Ice<br>
// * 邮箱： lb291700351@live.cn<br>
// * 时间：2017/4/5 15:43<br>
// * 类描述：<br>
// */
//public class BaseImpl<T> implements BaseDao<T> {
//
//    @Autowired
//    protected SqlSessionTemplate sqlSession;
//
//    @Override
//    public void save(T t) {
//        sqlSession.insert(this.getClass().getName() + ".save", t);
//    }
//
//    @Override
//    public void deleteById(long id) {
//        sqlSession.delete(this.getClass().getName() + ".deleteById", id);
//    }
//
//    @Override
//    public void update(T t) {
//        sqlSession.update(this.getClass().getName() + ".update", t);
//    }
//
//    @Override
//    public T findById(long id) {
//        return sqlSession.selectOne(this.getClass().getName() + ".findById", id);
//    }
//
//
//    @Override
//    public List<T> findAll() {
//        return sqlSession.selectList(this.getClass().getName() + ".findAll");
//    }
//
//    @Override
//    public long getCount() {
//        return sqlSession.selectOne(this.getClass().getName() + ".getCount");
//    }
//}
