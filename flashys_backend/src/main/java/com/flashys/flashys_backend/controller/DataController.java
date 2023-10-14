package com.flashys.flashys_backend.controller;


import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.service.ArtistService;
import com.flashys.flashys_backend.service.ArtistServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
@CrossOrigin
public class DataController {
    @Autowired
    private ArtistServiceImplementation artistService;

    @GetMapping("artists/{artist_id}")
    public Optional<Artist> getArtistsById(@PathVariable String artist_id) {
        return artistService.getArtistById(artist_id);
    }

}
