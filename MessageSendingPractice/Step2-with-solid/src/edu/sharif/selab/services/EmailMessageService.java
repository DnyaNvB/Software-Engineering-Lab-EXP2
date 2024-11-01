package edu.sharif.selab.services;
import edu.sharif.selab.models.EmailMessage;
import java.util.regex.Pattern;

public class EmailMessageService implements EmailService {
    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        if (validateEmailAddress(emailMessage.getSourceEmailAddress()) && validateEmailAddress(emailMessage.getTargetEmailAddress())) {
            System.out.println("Sending Email from " + emailMessage.getSourceEmailAddress() +
                    " to " + emailMessage.getTargetEmailAddress() +
                    " with content: " + emailMessage.getContent());
        } else {
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }

    private boolean validateEmailAddress(String email) {
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
}