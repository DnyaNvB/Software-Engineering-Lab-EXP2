package edu.sharif.selab.services;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements TelegramService {
    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        boolean validMessage;

        if (telegramMessage.getSourceId() != null && telegramMessage.getTargetId() != null) {
            validMessage = validateId(telegramMessage.getSourceId()) && validateId(telegramMessage.getTargetId());
        } else if (telegramMessage.getSourcePhoneNumber() != null && telegramMessage.getTargetPhoneNumber() != null) {
            validMessage = validatePhoneNumber(telegramMessage.getSourcePhoneNumber()) && validatePhoneNumber(telegramMessage.getTargetPhoneNumber());
        } else {
            validMessage = false;
        }

        if (validMessage) {
            if (telegramMessage.getSourceId() != null && telegramMessage.getTargetId() != null) {
                System.out.println("Sending Telegram message from ID: " + telegramMessage.getSourceId() +
                        " to ID: " + telegramMessage.getTargetId() +
                        " with content: " + telegramMessage.getContent());
            } else {
                System.out.println("Sending Telegram message from phone: " + telegramMessage.getSourcePhoneNumber() +
                        " to phone: " + telegramMessage.getTargetPhoneNumber() +
                        " with content: " + telegramMessage.getContent());
            }
        } else {
            throw new IllegalArgumentException("Source or Target information is Not Correct!");
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 11 && phoneNumber.chars().allMatch(Character::isDigit);
    }

    private boolean validateId(String id) {
        return id.length() >= 5 && id.matches("[a-zA-Z0-9]+");
    }
}