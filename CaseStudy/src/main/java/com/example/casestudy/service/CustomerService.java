package com.example.casestudy.service;

import com.example.casestudy.model.Customer;
import com.example.casestudy.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void remove(Integer id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public void save(Customer blog) {

    }

    @Override
    public void update(Customer blog) {

    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }


}
