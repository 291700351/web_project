package com.icelee.service;

import com.icelee.pojo.bean.Admin;
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
public interface AdminService {

    public Admin login(String username, String password);
}
