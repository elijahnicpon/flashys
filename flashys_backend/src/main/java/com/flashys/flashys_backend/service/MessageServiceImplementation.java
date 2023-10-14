package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Message;
import com.flashys.flashys_backend.repository.AppointmentRepository;
import com.flashys.flashys_backend.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImplementation implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    public void AppointmentServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> getMessagesByUserIdSortByTimestamp(String userId) {
//        List<Message> messages = getAllMessages();
//        for
        return null;
    }

    @Override
    public List<Message> getMessagesByArtistIdSortByTimestamp(String ArtistId) {
        return null;
        // Continue Later
    }

    @Override
    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
    @Override
    public Message getMessageById(String messageId) {
        return messageRepository.findById(messageId).orElse(null);
    }
    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
    @Override
    public void deleteMessage(String messageId) {
        messageRepository.deleteById(messageId);
    }





}
