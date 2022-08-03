package com.example.casestudy.repository.Customer;

import com.example.casestudy.model.CustomerModel.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
