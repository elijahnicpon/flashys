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


    
}
