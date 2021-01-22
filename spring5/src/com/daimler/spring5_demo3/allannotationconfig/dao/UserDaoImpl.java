package com.daimler.spring5_demo3.allannotationconfig.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("allannotationconfig Dao add........");
    }
}
