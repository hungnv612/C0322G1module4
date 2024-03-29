package com.example.casestudy.repository;


import com.example.casestudy.model.decentralization.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String name);
}
