package com.tz.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@Controller // 返回页面
@RestController //返回数据
public class TestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping(value = "/hello/post",method = RequestMethod.POST)
    public String helloPost(String name) {
        return "Hello World!" + name;
    }
}
