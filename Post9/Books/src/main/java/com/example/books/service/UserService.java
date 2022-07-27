package com.example.books.service;

import com.example.books.model.User;
import com.example.books.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService implements IUserService {

    @Autowired
    IUserRepository iUserRepository;


    @Override
    public Long random() {
        return (long) (Math.floor(Math.random() * 10000) + 9999);
    }

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void remove(Integer id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public void save(User user) {
        user.setCodeUser(random());
        iUserRepository.save(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }

    @Override
    public User findByCodeUser(Long code) {
        return iUserRepository.findByCodeUser(code);
    }
}
