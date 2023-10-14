package com.flashys.flashys_backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "message")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Message {
    @Id
    private String messageId;
    private String userId;
    private String artistId;
    private Date timestamp;
}
