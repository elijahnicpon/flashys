package com.flashys.flashys_backend.controller;

import com.flashys.flashys_backend.model.Flash;
import com.flashys.flashys_backend.repository.FlashRepository;
import com.mongodb.client.model.geojson.Point;
//import org.springframework.data.mongodb.core.geojson.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class FlashController {
    @Autowired
    private FlashRepository flashRepository;

//    @GetMapping("/flashes/all-unreserved")
//    public List<Flash> findUnreservedFlashes() {
//        return flashRepository.findAllByIsReservedFalse();
//    }

//    @GetMapping("/flashes/all-unreserved-by-location/{location}")

//    @GetMapping("/flashes/by-artist-location")
//    public ResponseEntity<List<Flash>> findFirst100FlashesByArtistLocation(@RequestParam double artistLocationLon, @RequestParam double artistLocationLat) {
//        Point artistLocation = new Point(artistLocationLon, artistLocationLat);
//        List<Flash> flashes = flashRepository.findFirst100FlashesByArtistLocation(artistLocation);
//        return ResponseEntity.ok(flashes);
//    }
}
