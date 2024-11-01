package edu.sharif.selab.models;

public enum MessageType {
    SMS("Send a text message via SMS"),
    EMAIL("Send an email message"),
    TELEGRAM("Send a message through Telegram");

    private final String description;

    MessageType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}