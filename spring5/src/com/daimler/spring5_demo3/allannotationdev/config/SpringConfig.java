package com.daimler.spring5_demo3.allannotationdev.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *  完全注解开发
 *      1. 创建配置类, 替代xml配置文件
 *      2.
 */
@Configuration  //作为配置类, 替代xml配置文件
@ComponentScan(basePackages = {"com.daimler.spring5_demo3.allannotationdev"})
public class SpringConfig {

}
