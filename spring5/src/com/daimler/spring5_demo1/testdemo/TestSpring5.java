package com.daimler.spring5_demo1.testdemo;

import com.daimler.spring5_demo1.Book;
import com.daimler.spring5_demo1.Orders;
import com.daimler.spring5_demo1.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd(){

        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);

        user.add();
    }

    @Test
    public void testBook() {
        //1, 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2. 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book1", Book.class);

        System.out.println(book);
        book.testDemo();

        System.out.println(book1);
        book1.testDemo();

    }

    @Test
    public void testOrders() {
        //1, 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2. 获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);

        orders.ordersTest();
    }
}
