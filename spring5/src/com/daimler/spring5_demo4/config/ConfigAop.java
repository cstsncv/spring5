package com.daimler.spring5_demo4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.daimler.spring5_demo4.aopanno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
