package com.flashys.flashys_backend.controller;

import com.flashys.flashys_backend.model.Flash;
import com.flashys.flashys_backend.repository.FlashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class FlashController {
    @Autowired
    private FlashRepository flashRepository;

    @GetMapping("/flash/all")
    public List<Flash> findAllFlashes() {
        return flashRepository.findAll();
    }

    // TODO: get by artist id (see: PortfolioEntry.java/findPortfolioEntriesByArtistId)

//    @GetMapping("/flash/allUnreserved")
//    public List<Flash> findAllUnreservedFlashes() {
//        return flashRepository.findAllByIsReservedFalse();
//    }
}
