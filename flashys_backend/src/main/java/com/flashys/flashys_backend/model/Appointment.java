package com.flashys.flashys_backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "appointment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Appointment {

    @Id
    private String appointmentId;
    @Id
    private String flashId; // If null --> commission
    @Id
    private String artistId;
    @Id
    private String userId;
    private Date startTime;
    private Date endTime;
    private boolean isAccepted;
    
    


}