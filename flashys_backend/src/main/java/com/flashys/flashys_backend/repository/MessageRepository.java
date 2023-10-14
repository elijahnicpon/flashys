package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {

}
