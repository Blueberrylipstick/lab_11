package ua.ucu.edu.apps.task2.strategies;

import ua.ucu.edu.apps.task2.Client;
import ua.ucu.edu.apps.task2.MailInfo;

public class BirthdaySender extends MailSender{
    private String message = "Happy birthday! ";

    public void sendMail(MailInfo info) {
        Client cl = info.getCl();
        System.out.println("Message: " + this.message + 
        "was sent to client: " + cl.getName());
    }
}
