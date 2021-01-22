package com.daimler.spring5_demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {

        UserDaoImpl userDao = new UserDaoImpl();

        Class[] interfaces = {UserDao.class};

        UserDao o = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        int add = o.add(1, 2);
        System.out.println(add);
        System.out.println(o.update("123"));
    }


}

class UserDaoProxy implements InvocationHandler {
    private Object obj;
    public UserDaoProxy (Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行, 方法名: " + method.getName() + ", 传递的参数: " + Arrays.toString(args));
        Object invoke = method.invoke(obj, args);
        System.out.println("方法执行之后..." + obj);
        return invoke;
    }
}