package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.model.ArtistWithPortfolioEntries;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends MongoRepository<Artist, String> {
    // You can add custom queries here if needed.
}