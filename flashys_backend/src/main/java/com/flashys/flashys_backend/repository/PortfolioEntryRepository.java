package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.PortfolioEntry;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PortfolioEntryRepository extends MongoRepository<PortfolioEntry, String> {
    // You can add custom queries here if needed.
    List<PortfolioEntry> getPortfolioEntriesByArtistId(String artistId);
    List<PortfolioEntry> findByArtistIdOrderByDateDesc(String artistId, Pageable pageable);

}
