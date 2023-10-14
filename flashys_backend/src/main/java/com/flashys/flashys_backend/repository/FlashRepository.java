package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.Flash;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashRepository extends MongoRepository<Flash, String> {
    // You can add custom queries here if needed.
}