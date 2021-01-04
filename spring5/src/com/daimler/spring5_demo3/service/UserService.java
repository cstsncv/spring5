package com.daimler.spring5_demo3.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/** 基于注解方式实现对象创建
 * @Component
 * @Service
 * @Controller
 * @Repository
 * 上面四个注解功能一样, 都可用来创建bean实例
 *
 *  1. 引入依赖 spring-aop-5.2.6.RELEASE.jar
 *  2. 开启组件扫描
 *  3. 创建类, 在类上面添加创建对象注解
 */

// 在注解里面value值属性可以省略不写, 默认值是类名称首字母小写
//@Component(value = "userService")  // <bean id="userService" class="..."/>
@Service
public class UserService {
    public void add(){
        System.out.println("Service add.......");
    }
}
