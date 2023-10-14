package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistServiceImplementation implements ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    public void ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Optional<Artist> createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public Optional<Artist> getArtistById(String artistId) {
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
}