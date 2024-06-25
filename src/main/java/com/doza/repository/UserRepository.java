package com.doza.repository;

import com.doza.util.ConnectionPool;

public class UserRepository {

    private final ConnectionPool connectionPool;
    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
