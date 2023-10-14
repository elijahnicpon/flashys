package com.flashys.flashys_backend.model;

import java.util.Base64
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