package com.daimler.spring5_demo3.allannotationdev;

import com.daimler.spring5_demo3.allannotationdev.config.SpringConfig;
import com.daimler.spring5_demo3.allannotationdev.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAllAnnoDev {
    @Test
    public void test(){
        // 1. 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
