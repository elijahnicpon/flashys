package com.flashys.flashys_backend.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "flash")
public class Flash {

}
