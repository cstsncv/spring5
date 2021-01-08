package com.daimler.spring5_demo3.allannotationdev.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("allannotationdev Dao UserDaoImpl add........");
    }
}
