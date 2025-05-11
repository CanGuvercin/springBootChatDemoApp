package com.tutorialseu.textchat.service;

// Service: ChatService.java
import com.tutorialseu.textchat.model.Message;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private List<Message> messageHistory = new ArrayList<>();

    // Method to send a message
    public void sendMessage(Message message) {
        messageHistory.add(message);
        System.out.println(message.getSender().getName() + " sent a message to " + message.getReceiver().getName() + ": " + message.getContent());
    }

    // Method to display chat history
    public void displayChatHistory() {
        System.out.println("Chat History:");
        for (Message message : messageHistory) {
            System.out.println(message.getSender().getName() + " to " + message.getReceiver().getName() + ": " + message.getContent());
        }
    }
}