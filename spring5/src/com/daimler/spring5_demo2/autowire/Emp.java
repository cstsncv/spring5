package com.daimler.spring5_demo2.autowire;

/**
 *  自动装配:
 *      根据指定装配规则(属性名称或属性类型), spring指定将匹配的属性值进行注入
 *
 *  自动装配过程"
 *  1. 根据属性名称自动注入
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
