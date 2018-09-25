//package com.example.web;
//
//import com.example.service.UserService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mock.web.MockServletContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
////=========方式一（spring 1.4后已取消）==========================================
////// SpringJUnit支持，由此引入spring-test框架支持
//@RunWith(SpringJUnit4ClassRunner.class)
//////指定我们spring工程的Application启动类
////@SpringApplicationConfiguration
//////由于是web项目，JUnit需要模拟ServletContext，因此需要给我们的测试类加上@WebAppConfiguration
////========方式二========================================================================================
//@SpringBootTest()
//public class jdbcTest{
//    @Autowired
//    private UserService userService;
//    @Before
//    public void setUp(){
//        userService.deleteAllUsers();
//    }
//    @Test
//    public void test()throws Exception{
//        userService.create("a",1);
//        userService.create("b",2);
//        Assert.assertEquals(2,userService.getAllUsers().intValue());
//        System.out.println(userService.getAllUsers().toString());
//    }
//
//}
