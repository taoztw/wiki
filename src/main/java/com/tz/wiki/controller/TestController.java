package com.tz.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller // 返回页面
@RestController //返回数据
public class TestController {

    // 使用配置项 :后面是默认的配置值
    @Value("${test.hello:TEST}")
    private String testHello;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "Hello World!" + testHello;
    }

    @RequestMapping(value = "/hello/post",method = RequestMethod.POST)
    public String helloPost(String name) {
        return "Hello World!" + name;
    }
}
