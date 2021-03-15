package com.epam.jwd.dao.impl;


import com.epam.jwd.bean.RegistrationInfo;
import com.epam.jwd.bean.User;
import com.epam.jwd.dao.DAOException;
import com.epam.jwd.dao.UserDAO;

public class SQLUserDAO implements UserDAO {
    static {
        MYSQLDriverLoader.getInstance();
    }

    @Override
    public User authorization(String login, String password) throws DAOException {

        System.out.println("USER AUTHORIZATION");

        return new User();
    }

    @Override
    public boolean registration(RegistrationInfo regInfo) {
        // TODO Auto-generated method stub
        return false;
    }
}
