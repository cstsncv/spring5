package com.daimler.spring5_demo3.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl111")
public class UserDaoImpl111 implements UserDao {
    @Override
    public void add() {
        System.out.println("Dao UserDaoImpl111 add........");
    }
}
