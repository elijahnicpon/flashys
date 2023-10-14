package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.Flash;
import com.mongodb.client.model.geojson.Point;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.unwind;

public interface FlashRepository extends MongoRepository<Flash, String> {
//    @Query("{ $geoNear: { near: { type: 'Point', coordinates: [$artistLocationLon, $artistLocationLat] } } }")
//    List<Flash> findFirst100FlashesByArtistLocation(Point artistLocation);
}
