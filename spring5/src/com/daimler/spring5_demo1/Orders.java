package com.daimler.spring5_demo1;

public class Orders {

    private String oname;

    private String address;

    public Orders() {
    }

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oname + "::" + address);
    }
}
