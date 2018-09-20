package com.example.web;

import com.example.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class helloController {

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
    //Controller类默认使用@RequestMapping("/")所以该类下得方法不能再使用次映射
    //@RequestMapping("/")错误
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("进入hello方法");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println("进入login方法");
        return "login";
    }

}