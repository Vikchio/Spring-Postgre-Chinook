package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Genre;
import com.example.repository.GenreRepository;

@Service
public class GenreService {
    @Autowired
    private GenreRepository repository;

    public List<Genre> all() {
        return repository.findAll();
    }
}
