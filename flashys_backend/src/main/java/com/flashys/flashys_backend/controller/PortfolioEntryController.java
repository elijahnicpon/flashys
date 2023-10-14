package com.flashys.flashys_backend.controller;

import com.flashys.flashys_backend.model.PortfolioEntry;
import com.flashys.flashys_backend.repository.PortfolioEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.sound.sampled.Port;
import java.util.List;

public class PortfolioEntryController {
    @Autowired
    private PortfolioEntryRepository portfolioEntryRepository;

    @GetMapping("/portfolioEntry/all")
    public List<PortfolioEntry> findAllPortfolioEntries() {
        return portfolioEntryRepository.findAll();
    }

    @GetMapping("/portfolioEntry/byArtistId/{artistId}")
    public List<PortfolioEntry> findPortfolioEntriesByArtistId(@PathVariable String artistId) {
        return portfolioEntryRepository.getPortfolioEntriesByArtistId(artistId);
    }
}
