package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{
    Optional<Genre> findById(int genre_id);
}
