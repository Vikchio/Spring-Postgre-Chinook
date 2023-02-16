package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Invoice;
import com.example.repository.InvoiceRepository;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository repository;

    public List<Invoice> all() {
        return repository.findAll();
    }
}
