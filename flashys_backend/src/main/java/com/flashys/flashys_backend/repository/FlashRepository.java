package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.Flash;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlashRepository extends MongoRepository<Flash, String> {
    List<Flash> getFlashesByArtistId(String artistId);

//    List<Flash> getFlashesByArtistIdOrderByDateDescending(String artistId);
    // You can add custom queries here if needed.
}