package com.angelhack.android_application.model;

/**
 * Created by matheuscatossi on 30/07/17.
 */

public class Message {

    String name;
    String message;
    String sender;

    public Message(String name, String message, String sender) {
        this.name = name;
        this.message = message;
        this.sender = sender;
    }

    public Message() {

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}