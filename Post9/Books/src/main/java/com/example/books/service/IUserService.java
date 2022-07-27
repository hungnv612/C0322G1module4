package com.example.books.service;

import com.example.books.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Long random( );

    List<User> findAll();

    Optional<User> findById(Integer id);

    void remove(Integer id);

    void save(User user);

    void update(User user);

    List<User> findByName(String name);

    User findByCodeUser(Long code);
}
