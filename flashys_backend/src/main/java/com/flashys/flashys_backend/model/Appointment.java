package com.flashys.flashys_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "appointment")
public class Appointment {

    @Id
    private String appointmentId;
    @Id
    private String flashId;
    @Id
    private String artistId;
    @Id
    private String userId;
    
    


}