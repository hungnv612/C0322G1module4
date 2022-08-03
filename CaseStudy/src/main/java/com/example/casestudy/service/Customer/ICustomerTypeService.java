package com.example.casestudy.service.Customer;

import com.example.casestudy.model.CustomerModel.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
