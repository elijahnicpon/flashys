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
    private String img; //base64str
    private Date date;
    private String description;
    @Id
    private String artistId;
    private String paymentPolicy;
    private boolean isReserved;
    private double salePercentage;

}
