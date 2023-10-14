package com.flashys.flashys_backend.controller;


import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.model.ArtistWithPortfolioEntries;
import com.flashys.flashys_backend.repository.ArtistRepository;
import com.flashys.flashys_backend.service.ArtistService;
import com.flashys.flashys_backend.service.ArtistServiceImplementation;
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

    @Autowired
    ArtistServiceImplementation artistServiceImplementation;

    @GetMapping("/artists/all")
    public List<Artist> findAllArtists() {
        return artistRepository.findAll();
    }

    @GetMapping("/artists/all-with-preview")
    public List<ArtistWithPortfolioEntries> getAllArtistsWithPreview() {
        return artistServiceImplementation.getArtistsWithRecentPortfolioEntries(4);
    }

    /**
     * returns all artists AND 4 of their portfolio entries
     */
//    @GetMapping("/artists/allWithPreview")
}
