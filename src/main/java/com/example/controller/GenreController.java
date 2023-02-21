package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Genre;
import com.example.service.GenreService;

@RestController
@RequestMapping("/api/genre")
public class GenreController {
    @Autowired
    private GenreService service;

    @GetMapping()
    public List<Genre> all() {
        return service.all();
    }
}
