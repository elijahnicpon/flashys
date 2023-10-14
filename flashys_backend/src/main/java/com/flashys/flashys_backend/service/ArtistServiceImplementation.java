package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.model.ArtistWithPortfolioEntries;
import com.flashys.flashys_backend.model.PortfolioEntry;
import com.flashys.flashys_backend.repository.ArtistRepository;
import com.flashys.flashys_backend.repository.PortfolioEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArtistServiceImplementation implements ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    PortfolioEntryRepository portfolioEntryRepository;

    @Autowired
    public void ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public Artist getArtistById(String artistId) {
        return artistRepository.findById(artistId).orElse(null);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public void deleteArtist(String artistId) {
        artistRepository.deleteById(artistId);
    }

    public void deleteAllArtist() {
        artistRepository.deleteAll();
    }

    public List<ArtistWithPortfolioEntries> getArtistsWithRecentPortfolioEntries(int numberOfEntries) {
        List<Artist> artists = artistRepository.findAll();
        return artists.stream()
                .map(artist -> new ArtistWithPortfolioEntries(artist, getRecentPortfolioEntries(artist, numberOfEntries)))
                .collect(Collectors.toList());
    }

    private List<PortfolioEntry> getRecentPortfolioEntries(Artist artist, int numberOfEntries) {
        return portfolioEntryRepository.findByArtistIdOrderByDateDesc(artist.getArtistId(), PageRequest.of(0, numberOfEntries));
    }
}