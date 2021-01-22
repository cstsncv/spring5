package com.daimler.spring5_demo6_tx1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 少钱
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=?";

        jdbcTemplate.update(sql, 100, "lucy");
    }

    // 多钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";

        jdbcTemplate.update(sql, 100, "mary");
    }
}
