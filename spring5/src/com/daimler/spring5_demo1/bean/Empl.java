package com.daimler.spring5_demo1.bean;

// 员工类
public class Empl {
    private String ename;
    private String gender;
    // 员工所属某一个部门
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
