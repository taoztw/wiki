package com.tz.wiki.controller;

import com.tz.wiki.domain.Test;
import com.tz.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//@Controller // 返回页面
@RestController //返回数据
public class TestController {

    // 使用配置项 :后面是默认的配置值
    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "Hello World!" + testHello;
    }

    @RequestMapping(value = "/test/list",method = RequestMethod.GET)
    public List<Test> list() {
        return testService.list();
    }

    @RequestMapping(value = "/hello/post",method = RequestMethod.POST)
    public String helloPost(String name) {
        return "Hello World!" + name;
    }
}
