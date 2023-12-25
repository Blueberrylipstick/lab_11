package ua.ucu.edu.apps.task2.strategies;

import ua.ucu.edu.apps.task2.Client;
import ua.ucu.edu.apps.task2.MailInfo;

public class GiftSender extends MailSender{
    private String message = "You received a gift!";

    public void sendMail(MailInfo info) {
        Client cl = info.getCl();
        System.out.println("Message: " + this.message + 
        "was sent to client: " + cl.getName());
    }
}
