package com.epam.jwd.service.impl;

import com.epam.jwd.bean.RegistrationInfo;
import com.epam.jwd.bean.User;
import com.epam.jwd.dao.DAOException;
import com.epam.jwd.dao.DAOProvider;
import com.epam.jwd.dao.UserDAO;
import com.epam.jwd.service.ServiceException;
import com.epam.jwd.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User authorization(String login, String password) throws ServiceException {
        // validation
        if(login == null || "".equals(login) ) {// to bo cont....
            throw new ServiceException("wrong login or password");
        }

        DAOProvider provider = DAOProvider.getInstance();
        UserDAO userDAO = provider.getUserdao();

        User user = null;
        try {
            user = userDAO.authorization(login, password);
        }catch(DAOException e) {
            throw new ServiceException("error message", e);
        }
        return user;
    }

    @Override
    public boolean registration(RegistrationInfo regInfo){
        // TODO Auto-generated method stub
        return false;
    }

}