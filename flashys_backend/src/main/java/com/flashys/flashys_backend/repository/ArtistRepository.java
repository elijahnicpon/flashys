package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends MongoRepository<Artist, String> {
    // You can add custom queries here if needed.
}