package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@RestController
public class HellowController {
    @RequestMapping("/trigger/exception")
    public String triggerException(){
        Integer a = 1;
        a=100/0;
        return  a.toString();
    }
    @RequestMapping("/")
    public String hello(){
//        log.info("可以直接调用log打印日志了");
        return "Hello ,World";
    }
    @RequestMapping(value="/info",method = {RequestMethod.GET })
    public String info(){
//        log.info("已经请求到了/info路径");
        return "access api:/info,successfully";
    }
    @RequestMapping(value="/java/info",method = {RequestMethod.GET })
    public String javaInfo(){
//        log.info("已经请求到了/info路径");
        return "access api:/java/info,successfully";
    }
    @RequestMapping(value="/post",method = {RequestMethod.POST})
    public String post(){
//        log.info("已经请求到了/post路径");
        return "access api:/post,successfully";
    }
    @RequestMapping(value="/error",method = {RequestMethod.GET})
    public String error(){
//        log.error("已经请求到了/error路径");
        return "access api:/error,successfully";
    }
    public String demo(){
//        log.error("已经请求到了/demo路径");
        return "access api:/demo,successfully";
    }
}
