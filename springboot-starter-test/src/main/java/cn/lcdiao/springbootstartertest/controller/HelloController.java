package cn.lcdiao.springbootstartertest.controller;

import cn.lcdiao.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: diao
 * @Description:
 * @Date: 2019/5/21 15:12
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHello("starter");
    }
}
