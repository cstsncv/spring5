package com.daimler.spring5_demo1;

/**
 *  演示使用set方法进行注入属性
 *
 */
public class Book {

    private String bname;
    private String bauthor;
    private String address = "default address";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book(String bname, String bauthor, String address) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.address = address;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public Book(String bname) {
        this.bname = bname;
    }

    public Book() {
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void testDemo(){
        System.out.println(bname + "::" + bauthor + "::" + address);
    }
}
