package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Optional<Album> findById(int album_id);
}
