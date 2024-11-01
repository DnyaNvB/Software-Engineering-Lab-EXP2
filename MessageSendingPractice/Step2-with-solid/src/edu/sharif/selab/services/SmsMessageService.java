package edu.sharif.selab.services;
import edu.sharif.selab.models.SmsMessage;

public class SmsMessageService implements SmsService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        if (validatePhoneNumber(smsMessage.getSourcePhoneNumber()) && validatePhoneNumber(smsMessage.getTargetPhoneNumber())) {
            System.out.println("Sending SMS from " + smsMessage.getSourcePhoneNumber() +
                    " to " + smsMessage.getTargetPhoneNumber() +
                    " with content: " + smsMessage.getContent());
        } else {
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 11 && phoneNumber.chars().allMatch(Character::isDigit);
    }
}