package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Artist;
import java.util.List;
import java.util.Optional;

public interface ArtistService {
    Artist createArtist(Artist artist);
    Artist getArtistById(String artistId);
    List<Artist> getAllArtists();
    void deleteArtist(String artistId);


}