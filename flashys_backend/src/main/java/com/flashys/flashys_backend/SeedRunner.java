package com.flashys.flashys_backend;

import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Component;

@ComponentScan("com.flashys")
public class SeedRunner implements CommandLineRunner {

//    @Autowired
//    private ArtistRepository artistRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hi from seeder!");
        System.out.println("Adding Artists!");
        Artist artist1 = new Artist("John Doe", "he/him", new GeoJsonPoint(0, 0), "Artist bio 1", "http://example.com/1", "base64str1", "artist1@example.com", "password1");
        Artist artist2 = new Artist("Jane Smith", "she/her", new GeoJsonPoint(1, 1), "Artist bio 2", "http://example.com/2", "base64str2", "artist2@example.com", "password2");
        artistRepository.saveAll(List.of(artist1, artist2));
    }
}
