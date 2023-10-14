package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Appointment;
import com.flashys.flashys_backend.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> getMessagesByUserIdSortByTimestamp(String userId);
    List<Message> getMessagesByArtistIdSortByTimestamp(String ArtistId);
    Message createMessage(Message message);
    Message getMessageById(String messageId);
    List<Message> getAllMessages();
    void deleteMessage(String messageId);
}
