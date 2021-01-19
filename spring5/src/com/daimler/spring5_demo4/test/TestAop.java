package com.daimler.spring5_demo4.test;

import com.daimler.spring5_demo4.aopanno.User;
import com.daimler.spring5_demo4.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.1.xml");
        Book user = context.getBean("book", Book.class);
        user.buy();
    }
}
