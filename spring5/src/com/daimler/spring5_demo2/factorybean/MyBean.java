package com.daimler.spring5_demo2.factorybean;

import com.daimler.spring5_demo2.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 *  Spring 有两种Bean, 普通Bean, 另外一种工厂Bean(FactoryBean)
 *      普通Bean: 在配置文件中定义bean类型就是返回类型
 *      工厂Bean: 在配置文件定义bean类型可以和返回类型不一样
 *          第一步: 创建类, 让这个类作为工厂bean, 实现接口FactoryBean
 *          第二步: 实现接口里的方法, 在实现的方法中定义返回的bean类型
 */
public class MyBean implements FactoryBean<Course> {

    // 定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
