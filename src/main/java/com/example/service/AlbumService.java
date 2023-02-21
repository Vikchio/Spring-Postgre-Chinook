package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Album;
import com.example.repository.AlbumRepository;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository repository;

    public List<Album> all() {
        return repository.findAll();
    }
}
