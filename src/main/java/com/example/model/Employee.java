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
@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private int employee_id;
    @Column
    private String last_name;
    @Column
    private String first_name;
    @Column
    private String title;
    @ManyToOne
    @JoinColumn(name = "reports_to")
    private Employee employee;
    @Column
    private Date birth_date;
    @Column
    private Date hire_date;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private String postal_code;
    @Column
    private String phone;
    @Column
    private String fax;
    @Column
    private String email;
}
