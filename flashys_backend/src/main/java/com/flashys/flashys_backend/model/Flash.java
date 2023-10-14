package com.flashys.flashys_backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "flash")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Flash {
   @Id
    private String flashId;
    private String artistId;
    private String flashTitle;
    private String img; //base64str
    private Date date;
    private String description;
    private String paymentPolicy;
    private boolean isReserved;
    private double salePercentage;

    public Flash(String artistId, String flashTitle, String img, Date date, String description, String paymentPolicy, boolean isReserved, double salePercentage) {
        this.artistId = artistId;
        this.flashTitle = flashTitle;
        this.img = img;
        this.date = date;
        this.description = description;
        this.paymentPolicy = paymentPolicy;
        this.isReserved = isReserved;
        this.salePercentage = salePercentage;
    }
}
