package com.example.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{
    Optional<Invoice> findById(int invoice_id);
}
