package com.maya.civil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName BuilderTest
 * @Author majp
 * @Description TODO
 * @Date 2020-07-08 0008 11:01
 * Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BuilderTest {
    @Test
    public void testBuider(){
        StringBuilder builder = new StringBuilder();
        builder.append("7898");
        // 00789
        System.out.println(builder.insert(0, "00").substring(0, 5));
        // 00789
        System.out.println(builder.substring(0, 5));
        // 007898
        System.out.println(builder);
    }



}
