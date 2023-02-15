package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "customer")
public class Customer {
    @Id
    private int customerId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String company;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private String postalCode;
    @Column
    private String phone;
    @Column
    private String fax;
    @Column
    private String email;
    @Column
    private int supportRepId;
}
