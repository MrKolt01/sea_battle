package com.epam.game.controller;

import com.epam.game.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author Denis Iaichnikov
 * @since 7/22/2018
 */
@Controller
public class ChatController {

    @MessageMapping("chat/send")
    @SendTo("/topic/chat")
    public ChatMessage send(ChatMessage message) {
        return message;
    }
}
