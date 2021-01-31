package com.daimler.spring5_demo6_tx.text;

import com.daimler.spring5_demo6_tx.config.TxConfig;
import com.daimler.spring5_demo6_tx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
