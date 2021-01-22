package com.daimler.spring5_demo6_tx1.text;

import com.daimler.spring5_demo6_tx1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
