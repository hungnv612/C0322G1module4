package com.example.formregister.service;

import com.example.formregister.model.User;


import java.util.List;

public interface IUserService {
    void create(User user);

    List<User> findAll();
}
