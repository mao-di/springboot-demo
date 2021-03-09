package com.jiyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:HandlerExceptionDemo
 * Author:maodi
 * CreateTime:2021/03/03/10:34
 */
@Controller
@RequestMapping("exception")
public class HandlerExceptionDemo {
    @RequestMapping("/show")
    public String showInfo(){
        String str = null;
        str.length();
        return "index";
    }

    @RequestMapping("/show2")
    public String showInfo2(){
        int a = 10/0;
        return "index";
    }
}
