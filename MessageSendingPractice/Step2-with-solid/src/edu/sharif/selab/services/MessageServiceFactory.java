package edu.sharif.selab.services;
import edu.sharif.selab.models.MessageType;

public class MessageServiceFactory {
    public static Object createMessageService(MessageType type) {
        return switch (type) {
            case SMS -> new SmsMessageService();
            case EMAIL -> new EmailMessageService();
            case TELEGRAM -> new TelegramMessageService();
        };
    }
}