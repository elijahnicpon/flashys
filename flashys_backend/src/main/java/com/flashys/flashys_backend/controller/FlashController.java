package com.flashys.flashys_backend.controller;

import com.flashys.flashys_backend.model.Flash;
import com.flashys.flashys_backend.repository.FlashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class FlashController {
    @Autowired
    private FlashRepository flashRepository;

    @GetMapping("/flash/all")
    public List<Flash> findAllFlashes() {
        return flashRepository.findAll();
    }

    @GetMapping("/flash/byArtistId/{artistId}")
    public List<Flash> findFlashesByArtistId(@PathVariable String artistId) {
        return flashRepository.getFlashesByArtistId(artistId);
    }

//    @GetMapping("/flash/allUnreserved")
//    public List<Flash> findAllUnreservedFlashes() {
//        return flashRepository.findAllByIsReservedFalse();
//    }
}
