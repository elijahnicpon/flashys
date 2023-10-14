package com.flashys.flashys_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Base64;
@Data
@Document(collection = "user")
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