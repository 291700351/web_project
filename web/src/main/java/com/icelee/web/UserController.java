package com.icelee.web;

import com.icelee.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private AdminService adminService;

    @RequestMapping("/login")
    public String login(ModelMap mm, @RequestParam(value = "username") String username, String password) {

        System.out.println(username + ";;;" + password);
        mm.addAttribute(username);

        return "userList";

    }
}
