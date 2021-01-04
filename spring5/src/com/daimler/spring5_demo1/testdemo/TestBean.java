package com.daimler.spring5_demo1.testdemo;

import com.daimler.spring5_demo1.bean.Empl;
import com.daimler.spring5_demo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testBean1(){
        //1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2. 创建配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }


    @Test
    public void testBean2(){
        //1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2. 创建配置创建的对象
        Empl empl = context.getBean("empl", Empl.class);
        empl.add();
    }
}
