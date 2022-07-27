package com.example.books.repository;

import com.example.books.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {

    User findByCodeUser(Long code);

}
