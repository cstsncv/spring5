package com.daimler.spring5_demo4.aopxml;

public class BookProxy {
    public void before(){
        System.out.println("Before........");
    }
}
// @Order 设置多个增强类优先级,值越小优先级越高
