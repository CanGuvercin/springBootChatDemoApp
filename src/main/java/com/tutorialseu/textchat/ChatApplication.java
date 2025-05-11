package com.tutorialseu.textchat;

import com.tutorialseu.textchat.controller.ChatController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class ChatApplication implements CommandLineRunner {

    @Autowired
    private ChatController chatController;

    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        chatController.startChat(); // Start the chat session when the application runs
    }
}
