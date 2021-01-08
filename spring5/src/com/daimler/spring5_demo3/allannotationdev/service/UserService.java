package com.daimler.spring5_demo3.allannotationdev.service;

import com.daimler.spring5_demo3.allannotationdev.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/** 基于注解方式实现对象创建
 * @Component 普通
 * @Service  业务逻辑层
 * @Controller  web层
 * @Repository  DAO层
 * 上面四个注解功能一样, 都可用来创建bean实例
 *
 *  1. 引入依赖 spring-aop-5.2.6.RELEASE.jar
 *  2. 开启组件扫描
 *  3. 创建类, 在类上面添加创建对象注解
 *  4.
 *  5. 基于注解方式实现属性注入
 *      5.1 @Autowired: 根据属性类型自动装配(如果有多个接口实现类, 需要使用@Qualifier按名称)
 *          第一步: 把service和dao对象创建, 在service和dao类添加创建对象注解
 *          第二步: 在service注入dao对象, 在service类添加dao类型属性, 在属性上面使用注解
 *
 *      5.2 @Qualifier: 根据属性名称进行注入
 *          这个@Qualifier的使用, 需要和上面@Autowired一起使用
 *          @Qualifier(value = "userDaoImpl1")
 *      5.3 @Resource: 可以根据类型注入, 也可根据名称注入
 *      import javax.annotation.Resource
 *
 *      5.4 @Value: 注入普通类型属性
 *
 */

// 在注解里面value值属性可以省略不写, 默认值是类名称首字母小写
//@Component(value = "userService")  // <bean id="userService" class="..."/>
@Service
public class UserService {

    //@Value
    @Value(value = "李铁锤")
    private String name;
    // 定义Dao属性, 不需要添加set方法
    // 添加属性注解
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;



    public void add(){
        System.out.println(userDao);
        System.out.println("allannotationdev Service add....... " + name);
        userDao.add();
    }
}
