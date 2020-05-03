package com.ft.blog.controller;

/**
 * @author ft
 * @version 1.0
 * @date 2020-05-03 22:04
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * index跳转
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String gohome(){
        return "index";
    }

}
