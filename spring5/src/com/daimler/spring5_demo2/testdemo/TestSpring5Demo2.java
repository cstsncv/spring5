package com.daimler.spring5_demo2.testdemo;

import com.daimler.spring5_demo2.autowire.Emp;
import com.daimler.spring5_demo2.collectiontype.Book;
import com.daimler.spring5_demo2.collectiontype.Course;
import com.daimler.spring5_demo2.collectiontype.Stu;
import com.daimler.spring5_demo2.lifecycle.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo2 {
    @Test
    public void testCollection(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Stu stu = context.getBean("stu", Stu.class);
        // 单实例
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book1);
//        com.daimler.spring5_demo2.collectiontype.Book@5fcd892a

        stu.test();
        System.out.println();

        book.show();

    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }

    @Test
    public void testLife(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean销毁
//        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void autowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.test();
    }
}
