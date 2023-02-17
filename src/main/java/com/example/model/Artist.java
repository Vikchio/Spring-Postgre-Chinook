package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Artist {
    @Id
    @GeneratedValue
    private int artist_id;
    @Column
    private String name;
}
