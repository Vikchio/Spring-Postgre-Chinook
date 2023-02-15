package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    
    @Autowired
    private CustomerService service;

    @GetMapping()
    public List<Customer> all() {
        return service.all();
    }
}