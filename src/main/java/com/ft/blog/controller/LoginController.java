package com.ft.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ft
 * @version 1.0
 * @date 2020-05-04 9:58
 */

/**
 * 登录模块
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @GetMapping("/login")
    public String login(){
        System.out.println("login");
        return "login";
    }


}
