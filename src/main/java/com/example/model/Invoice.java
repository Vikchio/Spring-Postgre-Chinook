package com.example.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue
    private int invoice_id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column
    private Date invoice_date;
    @Column
    private String billing_address;
    @Column
    private String billing_city;
    @Column
    private String billing_state;
    @Column
    private String billing_country;
    @Column
    private String billing_postal_code;
    @Column
    private double total;
}
