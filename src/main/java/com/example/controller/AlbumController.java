package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Album;
import com.example.service.AlbumService;


@RestController
@RequestMapping("/api/album")
public class AlbumController {
    @Autowired
    private AlbumService service;

    @GetMapping()
    public List<Album> all() {
        return service.all();
    }
}
