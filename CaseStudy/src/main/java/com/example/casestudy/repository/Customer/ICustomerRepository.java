package com.example.casestudy.repository.Customer;

import com.example.casestudy.model.CustomerModel.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {


    Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);

}
