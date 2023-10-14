package com.flashys.flashys_backend.model;

@Data
@Document(collection = "appointment")
public class Appointment {

    @Id
    private String appointmentId;
    @Id
    private String flashId;
    @Id
    private String artistId;
    
    


}