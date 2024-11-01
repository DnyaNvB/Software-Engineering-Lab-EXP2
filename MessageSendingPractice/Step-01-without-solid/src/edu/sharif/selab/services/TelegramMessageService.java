package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        // Empty Body!
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        // Empty Body!
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if (verifySourceAndTarget(telegramMessage)) {
            if (telegramMessage.getSourceId() != null && telegramMessage.getTargetId() != null) {
                System.out.println("Sending a Telegram message from ID: " + telegramMessage.getSourceId() +
                        " to ID: " + telegramMessage.getTargetId() + " with content: " + telegramMessage.getContent());
            } else {
                System.out.println("Sending a Telegram message from phone: " + telegramMessage.getSourcePhoneNumber() +
                        " to phone: " + telegramMessage.getTargetPhoneNumber() + " with content: " + telegramMessage.getContent());
            }
        } else {
            throw new IllegalArgumentException("Source or Target information is Not Correct!");
        }
    }

    private boolean verifySourceAndTarget(TelegramMessage telegramMessage) {
        if (telegramMessage.getSourceId() != null && telegramMessage.getTargetId() != null) {
            return validateId(telegramMessage.getSourceId()) && validateId(telegramMessage.getTargetId());
        } else if (telegramMessage.getSourcePhoneNumber() != null && telegramMessage.getTargetPhoneNumber() != null) {
            return validatePhoneNumber(telegramMessage.getSourcePhoneNumber()) && validatePhoneNumber(telegramMessage.getTargetPhoneNumber());
        } else {
            return false;
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }

        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false;
            }
        }

        return true;
    }

    private boolean validateId(String id) {
        return id.length() >= 5 && id.matches("[a-zA-Z0-9]+");
    }
}