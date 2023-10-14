package com.flashys.flashys_backend.controller;


import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class ArtistController {
    @Autowired
    private ArtistRepository artistRepository;

    @GetMapping("/artists/all")
    public List<Artist> findAllArtists() {
        return artistRepository.findAll();
    }
}
