package com.example.demo.service;

import com.example.demo.entity.UserAccount;

public interface UserAccountService {
    UserAccount findByUsername(String username);
}
