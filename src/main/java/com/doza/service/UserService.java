package com.doza.service;

import com.doza.repository.CompanyRepository;
import com.doza.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository1) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository1;
    }
}
