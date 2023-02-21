package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Album {
    @Id
    @GeneratedValue
    private int album_id;
    @Column
    private String title;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
}
