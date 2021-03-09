package com.jiyun.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:DemoController
 * Author:maodi
 * CreateTime:2021/03/02/19:37
 */
@RestController
public class DemoController {
    @Autowired
    DruidDataSource dataSource;
    @RequestMapping("hello")
    public Map<String, Object> showHelloWorld() {
        Map<String, Object> map = new HashMap<>();
        map.put("url", dataSource.getUrl());
        map.put("password", dataSource.getPassword());
        return map;
    }
}
