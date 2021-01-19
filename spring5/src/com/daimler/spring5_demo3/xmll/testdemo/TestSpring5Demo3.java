package com.daimler.spring5_demo3.xmll.testdemo;

import com.daimler.spring5_demo3.xmll.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo3 {

    @Test
    public void testService(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }
}
