package com.daimler.spring5_demo2.collectiontype;

public class Course {
    private String cname;  // 课程名称

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
