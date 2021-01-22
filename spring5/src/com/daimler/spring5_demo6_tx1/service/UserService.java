package com.daimler.spring5_demo6_tx1.service;

import com.daimler.spring5_demo6_tx1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    //注入Dao
    @Autowired
    private UserDao userDao;

    // 转账方法
    @Transactional(propagation = Propagation.REQUIRED) // 事务注解
    public void accountMoney(){

        // 编程方法
//        try {
//            //    第一步: 开启事务
//
//            // 第二步: 进行业务操作
//
//            // lucy 少100
            userDao.reduceMoney();
//
//            //模拟异常
            int i = 1/0;

//            // mary多100
            userDao.addMoney();
//
//            // 第三步: 如果没有发生异常, 提交事务
//
//        } catch (Exception e) {
//            // 第四步: 出现异常, 事务回滚
//            e.printStackTrace();
//        }


    }
}
