package com.maya.civil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloStarter
 * @Author majp
 * @Description TODO
 * @Date 2020-07-06 0006 11:00
 * Version 1.0
 **/
@SpringBootApplication
public class HelloStarter {
    public static void main(String[] args) {
        SpringApplication.run(HelloStarter.class,args);
    }
}
