package com.maya.civil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author majp
 * @Description TODO
 * @Date 2020-07-06 0006 11:56
 * Version 1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello,my springboot";
    }
}
