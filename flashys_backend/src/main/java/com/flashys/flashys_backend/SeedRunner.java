package com.flashys.flashys_backend;

import com.flashys.flashys_backend.model.Artist;
import com.flashys.flashys_backend.model.Flash;
import com.flashys.flashys_backend.model.PortfolioEntry;
import com.flashys.flashys_backend.repository.ArtistRepository;
import com.flashys.flashys_backend.repository.FlashRepository;
import com.flashys.flashys_backend.repository.PortfolioEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ComponentScan("com.flashys")
public class SeedRunner implements CommandLineRunner {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private FlashRepository flashRepository;

    @Autowired
    private PortfolioEntryRepository portfolioEntryRepository;
    @Override
    public void run(String... args) throws Exception {
        // TODO: replace below array with actual b64 images!
        String[] base64images_flash = {"image1placeholder_flash", "image2placeholder_flash","image3placeholder_flash","image4placeholder_flash"};
        String[] base64images_portfolio = {"image1placeholder_portfolio", "image2placeholder_portfolio","image3placeholder_portfolio","image4placeholder_portfolio"};

        System.out.print("Dropping current contents... \t");
        artistRepository.deleteAll();
        flashRepository.deleteAll();
        portfolioEntryRepository.deleteAll();

        System.out.print("Seeder adding Artists... \t");

        Artist a1 = new Artist("John Doe", "he/him", new GeoJsonPoint(0, 0), "Artist bio 1", "http://example.com/1", "base64pfp1", "artist1@example.com", "password1");
        Artist a2 = new Artist("TutuTattoo", "she/her", new GeoJsonPoint(0,0), "Lorem Ipsum BIooooo", "http://example.com/2", "base64pfp2", "artist2@eaxmple.com", "password2");
        artistRepository.saveAll(List.of(a1, a2));
        List<Artist> artists = artistRepository.findAll();
        System.out.print("\nArtists now contains:" + artists);

        System.out.print("\nCreating flashes (and soon portfolioEntrys)...");

        ArrayList<Flash> flashes = new ArrayList<>();
        ArrayList<PortfolioEntry> portfolioEntries = new ArrayList<>();
        for (int i = 0; i < artists.size() * 2; i++) {
            flashes.add(new Flash(
                    artists.get(i % 2).getArtistId(), // artistId
                    "Tattoo Title " + i, // title
                    base64images_flash[i], // img
                    new Date(), // date
                    "Lorem Ipsum", // descript
                    "This is a payment policy!", // payment
                    false, // isReserved
                    1.0 // sale %
            ));
            portfolioEntries.add(new PortfolioEntry(
                    artists.get(i % 2).getArtistId(),
                    base64images_portfolio[i],
                    new Date(),
                    "This is a description"
            ));
        }

        flashRepository.saveAll(flashes);
        System.out.print("\nFlash now contains:" + flashRepository.findAll());

        portfolioEntryRepository.saveAll(portfolioEntries);
        System.out.print("\nPortfolioEntries now contains:" + portfolioEntryRepository.findAll());

        System.out.print("\n\n Seeding Complete!");
    }
}
