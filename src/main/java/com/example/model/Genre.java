package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Genre {
    @Id
    @GeneratedValue
    private int genre_id;
    @Column
    private String name;
}
