package com.flashys.flashys_backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "portfolioEntry")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PortfolioEntry {
    @Id
    private String portfolioEntryId;
    private String artistId;
    private String img; //base64Str
    private Date date;
    private String description;

    public PortfolioEntry(String artistId, String img, Date date, String description) {
        this.artistId = artistId;
        this.img = img;
        this.date = date;
        this.description = description;
    }
}
