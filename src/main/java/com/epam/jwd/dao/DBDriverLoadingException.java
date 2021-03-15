package com.epam.jwd.dao;

public class DBDriverLoadingException extends RuntimeException{

    public DBDriverLoadingException(Exception e) {
        super(e);
    }
}

