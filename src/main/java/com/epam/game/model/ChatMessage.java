package com.epam.game.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Denis Iaichnikov
 * @since 7/22/2018
 */
@Getter
@Setter
public class ChatMessage {

    private String sender;
    private String message;
}
