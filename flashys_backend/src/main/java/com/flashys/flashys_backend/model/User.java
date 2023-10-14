package com.flashys.flashys_backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.util.Base64;
@Data
@Document(collection = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private String userId;

    private String displayName;
    private GeoJsonPoint location;
    private String bio;
    private String profilePicture;
    private String email;
    private String pronouns;
    private String password;
    
    
}