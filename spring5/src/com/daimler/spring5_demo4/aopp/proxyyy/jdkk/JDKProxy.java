package com.daimler.spring5_demo4.aopp.proxyyy.jdkk;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        // 被代理类对象
        UserDaoImpl userDao = new UserDaoImpl();


        // 创建接口实现类代理对象

        Class[] interfaces = {UserDao.class};
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        System.out.println(add);

    }
}

// 创建代理对象
class UserDaoProxy implements InvocationHandler{
    // 1. 将被代理对象传入
    private Object obj;

    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("方法之前执行......: " + method.getName() + " ,传递参数: " + Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(obj, args);

        // 方法之后执行
        System.out.println("方法之后执行: 被代理的对象: " + obj);
        return res;
    }
}