package com.example.casestudy.service;

import com.example.casestudy.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(Integer id);

    void remove(Integer id);

    void save(Customer blog);

    void update(Customer blog);

    List<Customer> findByName(String name);
}
