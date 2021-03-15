package com.epam.jwd.dao;

import com.epam.jwd.bean.RegistrationInfo;
import com.epam.jwd.bean.User;

public interface UserDAO {
    User authorization (String login, String password) throws DAOException;
    boolean	registration(RegistrationInfo regInfo) throws DAOException;
}
