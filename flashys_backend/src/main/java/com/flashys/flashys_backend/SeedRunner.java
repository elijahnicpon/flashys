package com.flashys.flashys_backend;

import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.List;

@ComponentScan("com.flashys")
public class SeedRunner implements CommandLineRunner {

    @Autowired
    private ArtistRepository artistRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Seeder adding Artists");
        Artist a1 = new Artist("John Doe", "he/him", new GeoJsonPoint(0, 0), "Artist bio 1", "http://example.com/1", "base64str1", "artist1@example.com", "password1");
        artistRepository.saveAll(List.of(a1));
        System.out.println(artistRepository.findAll());
    }
}
