package edu.sharif.selab.services;
import edu.sharif.selab.models.TelegramMessage;

public interface TelegramService {
    void sendTelegramMessage(TelegramMessage telegramMessage);
}