package com.example.casestudy.repository.Customer;

import com.example.casestudy.model.CustomerModel.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {


    List<Customer> findByCustomerNameContaining(String name);

}
