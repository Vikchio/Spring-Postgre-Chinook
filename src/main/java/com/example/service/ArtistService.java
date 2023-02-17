package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Artist;
import com.example.repository.ArtistRepository;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository repository;

    public List<Artist> all() {
        return repository.findAll();
    }
}
