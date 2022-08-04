package com.example.casestudy.service.Customer;

import com.example.casestudy.model.CustomerModel.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(Integer id);

    void remove(Integer id);

    void save(Customer blog);

    void update(Customer blog);

    Page<Customer> findByName(String name,Pageable pageable);
}
