package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer>{
    Optional<Artist> findById(int artist_id);
}
