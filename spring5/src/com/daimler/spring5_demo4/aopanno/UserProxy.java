package com.daimler.spring5_demo4.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 增强的类
@Component
@Aspect  //生成代理对象
@Order(1) //设置多个增强类优先级,值越小优先级越高
public class UserProxy {

    // 相同切入点抽取
    @Pointcut(value = "execution(* com.daimler.spring5_demo4.aopanno.User.add(..))")
    public void pointdemo(){}

    //前置通知
    //@Before 注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before........");
    }

    // 后置通知
    @AfterReturning(value = "execution(* com.daimler.spring5_demo4.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning......");
    }

    // 最终通知(无论是否有异常都会执行)
    @After(value = "execution(* com.daimler.spring5_demo4.aopanno.User.add(..))")
    public void after(){
        System.out.println("After......");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.daimler.spring5_demo4.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing......");
    }

    @Around(value = "execution(* com.daimler.spring5_demo4.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前......");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后......");
    }
}
