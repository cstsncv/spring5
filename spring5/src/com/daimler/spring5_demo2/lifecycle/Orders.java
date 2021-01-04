package com.daimler.spring5_demo2.lifecycle;

/**
 *  bean生命周期
 *  1. 通过构造器创建bean实例(无参构造器)
 *  2. 为bean的属性设置值和对其他bean引用(调用set方法)
 *  3. 调用bean的初始化的方法(需要bean.xml进行配置初始化的方法)
 *  4. bean可以使用 (获取到对象)
 *  5. 当容器关闭时, 调用bean的销毁的方法 (需要bean.xml进行配置销毁的方法)
 *
 *  bean的后置处理器:  见MyBeanPost
 *  1. 通过构造器创建bean实例(无参构造器)
 *  2. 为bean的属性设置值和对其他bean引用(调用set方法)
 *  3. 把bean实例传递bean后置处理器的方法 postProcessBeforeInitialization
 *  4. 调用bean的初始化的方法(需要bean.xml进行配置初始化的方法)
 *  5. 把bean实例传递bean后置处理器的方法 postProcessAfterInitialization
 *  6. bean可以使用 (获取到对象)
 *  7. 当容器关闭时, 调用bean的销毁的方法 (需要bean.xml进行配置销毁的方法)
 */
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步 执行无参构造器 创建Bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用set方法, 设置属性的值");
    }

    // 创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步 执行初始化方法");
    }

    // 创建销毁时执行的方法
    public void destroyMethod(){
        System.out.println("第五步 执行销毁方法");
    }
}
