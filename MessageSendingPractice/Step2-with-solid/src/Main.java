import edu.sharif.selab.models.*;
import edu.sharif.selab.services.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, MessageType> messageTypeMap = new HashMap<>();

    static {
        messageTypeMap.put(1, MessageType.SMS);
        messageTypeMap.put(2, MessageType.EMAIL);
        messageTypeMap.put(3, MessageType.TELEGRAM);
    }

    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            MessageType messageType = messageTypeMap.get(choice);
            if (messageType == null) {
                System.out.println("Invalid choice.");
                continue;
            }

            handleMessage(messageType);
        }
    }

    private static void displayMenu() {
        System.out.println("Select the type of message to send:");
        for (Map.Entry<Integer, MessageType> entry : messageTypeMap.entrySet()) {
            int option = entry.getKey();
            MessageType messageType = entry.getValue();
            System.out.println(option + ". " + messageType.name() + " - " + messageType.getDescription());
        }
        System.out.println("0. Exit");
    }

    private static void handleMessage(MessageType messageType) {
        Object service = MessageServiceFactory.createMessageService(messageType);

        switch (messageType) {
            case SMS -> sendSms((SmsService) service);
            case EMAIL -> sendEmail((EmailService) service);
            case TELEGRAM -> sendTelegram((TelegramService) service);
        }
    }

    private static void sendSms(SmsService service) {
        SmsMessage smsMessage = new SmsMessage();
        System.out.print("Enter source phone: ");
        smsMessage.setSourcePhoneNumber(scanner.next());
        System.out.print("Enter target phone: ");
        smsMessage.setTargetPhoneNumber(scanner.next());
        System.out.print("Enter message content: ");
        smsMessage.setContent(scanner.next());
        service.sendSmsMessage(smsMessage);
    }

    private static void sendEmail(EmailService service) {
        EmailMessage emailMessage = new EmailMessage();
        System.out.print("Enter source email: ");
        emailMessage.setSourceEmailAddress(scanner.next());
        System.out.print("Enter target email: ");
        emailMessage.setTargetEmailAddress(scanner.next());
        System.out.print("Enter message content: ");
        emailMessage.setContent(scanner.next());
        service.sendEmailMessage(emailMessage);
    }

    private static void sendTelegram(TelegramService service) {
        TelegramMessage telegramMessage = new TelegramMessage();
        System.out.print("Enter source ID or phone: ");
        telegramMessage.setSourceId(scanner.next());
        System.out.print("Enter target ID or phone: ");
        telegramMessage.setTargetId(scanner.next());
        System.out.print("Enter message content: ");
        telegramMessage.setContent(scanner.next());
        service.sendTelegramMessage(telegramMessage);
    }
}