package com.doza.repository;

import com.doza.util.ConnectionPool;

public class CompanyRepository {

    private final ConnectionPool connectionPool;
    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
