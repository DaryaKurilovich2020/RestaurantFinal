package com.epam.jwd.service;

import com.epam.jwd.bean.RegistrationInfo;
import com.epam.jwd.bean.User;

public interface UserService {
    User authorization(String login, String passport) throws ServiceException;
    boolean registration(RegistrationInfo regInfo) throws ServiceException;

}
