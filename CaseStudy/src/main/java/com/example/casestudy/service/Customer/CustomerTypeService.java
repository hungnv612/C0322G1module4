package com.example.casestudy.service.Customer;

import com.example.casestudy.model.CustomerModel.CustomerType;
import com.example.casestudy.repository.Customer.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {

    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }
}
