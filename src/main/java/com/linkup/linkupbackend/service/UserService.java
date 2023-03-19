package com.linkup.linkupbackend.service;

import com.linkup.linkupbackend.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> findAll();
}
