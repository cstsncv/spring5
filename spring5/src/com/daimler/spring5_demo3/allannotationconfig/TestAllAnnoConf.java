package com.daimler.spring5_demo3.allannotationconfig;

import com.daimler.spring5_demo3.allannotationconfig.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAllAnnoConf {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
