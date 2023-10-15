package com.flashys.flashys_backend;

import com.flashys.flashys_backend.etc.ImageToBase64Converter;
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

import java.io.IOException;
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

        String folderPath1 = "src/main/resources/imgs/flash";
        ArrayList<String> base64images_flash = new ArrayList<>();

        try {
            List<String> base64Images = ImageToBase64Converter.convertImagesToBase64(folderPath1);
            // Now, base64Images contains the base64-encoded PNG images
            for (String base64Image : base64Images) {
                base64images_flash.add(base64Image);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String folderPath2 = "src/main/resources/imgs/pfp";
        ArrayList<String> base64images_pfp = new ArrayList<>();

        try {
            List<String> base64Images = ImageToBase64Converter.convertImagesToBase64(folderPath2);
            // Now, base64Images contains the base64-encoded PNG images
            for (String base64Image : base64Images) {
                base64images_pfp.add(base64Image);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String folderPath3 = "src/main/resources/imgs/portfolio";
        ArrayList<String> base64images_portfolio = new ArrayList<>();

        try {
            List<String> base64Images = ImageToBase64Converter.convertImagesToBase64(folderPath3);
            // Now, base64Images contains the base64-encoded PNG images
            for (String base64Image : base64Images) {
                base64images_portfolio.add(base64Image);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.print("Dropping current contents... \t");
        artistRepository.deleteAll();
        flashRepository.deleteAll();
        portfolioEntryRepository.deleteAll();

        System.out.print("Seeder adding Artists... \t");

        Artist a1 = new Artist("Christopher Hem", "he/him", new GeoJsonPoint(-122.419416, 37.774929), "Tattoo artist with a passion for wildlife. I have a flash for almost any animal", "http://tatooInk.com/flashes/Christopher-Hem", base64images_pfp.get(0), "HemChristopher1997@gmail.com", "2282d2nB3#$@");
        Artist a2 = new Artist("Emily Johnson", "she/her", new GeoJsonPoint(-73.985130, 40.748817), "Experienced tattoo artist with a love for abstract designs. I am very creative and have been in the business for 20 years.", "http://freshInk.com/myArt-JohnsonEm-2", base64images_pfp.get(1), "EmilyJ12e@gmail.com", "Stevie505@!");
        Artist a3 = new Artist("Sarah Chase", "she/her", new GeoJsonPoint(-87.629799, 41.878113), "Creating unique and vibrant tattoos for over a decade. If you like flashes, then contact me!", "http://tatooX.com/Sarah-Chase_Portfolio", base64images_pfp.get(2), "Sarah1@ChaseS.com", "20014LDWW87");
        Artist a4 = new Artist("Michael Reeves", "he/him", new GeoJsonPoint(-80.191790, 25.761680), "I specialize in watercolor-style tattoos, but I can make any request. If you like my flashes then contact me or book and appointment,", "http://tatooX.com/Micharl-Reeves-Portfolio", base64images_pfp.get(3), "Mreeves455@gmail.com", "passwo32rdF#@");
        Artist a5 = new Artist("Dwayne James", "he/him", new GeoJsonPoint(-118.243683, 34.052235), "I am a new artist, but I have been doing art every since I was a kid. I love what I do, and hopefully you love my flashes!", "http://tatFlash.com/myart/DwayneTheMan/2", base64images_pfp.get(4), "JamesD53@gmail.com", "!@D!&Bd21dd");

        artistRepository.saveAll(List.of(a1, a2, a3, a4, a5));
        List<Artist> artists = artistRepository.findAll();
        System.out.print("\nArtists now contains:" + artists);

        System.out.print("\nCreating flashes (and soon portfolioEntrys)...");

        ArrayList<Flash> flashes = new ArrayList<>();
        ArrayList<PortfolioEntry> portfolioEntries = new ArrayList<>();
        for (int i = 0; i < artists.size() * 2; i++) {
            flashes.add(new Flash(
                    artists.get(i % 2).getArtistId(), // artistId
                    "Tattoo Title " + i, // title
                    base64images_flash.get(i), // img
                    new Date(), // date
                    "Lorem Ipsum", // descript
                    "This is a payment policy!", // payment
                    false, // isReserved
                    1.0 // sale %
            ));
            portfolioEntries.add(new PortfolioEntry(
                    artists.get(i % 2).getArtistId(),
                    base64images_portfolio.get(i),
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
