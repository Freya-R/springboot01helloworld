package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println();
       return "hello world!";
    }
}
