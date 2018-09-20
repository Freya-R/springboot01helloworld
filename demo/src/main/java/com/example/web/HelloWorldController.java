package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hel",produces="application/json;charset=UTF-8")
    public String hello() throws Exception{
       // return "你好";
        throw new Exception("发生错误123");
    }
}

