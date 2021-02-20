package com.spring5.service;

import com.spring5.dao.UserDao;
import com.spring5.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
