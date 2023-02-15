package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> all() {
        return repository.findAll();
    }

}