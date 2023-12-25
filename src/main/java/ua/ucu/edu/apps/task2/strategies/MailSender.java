package ua.ucu.edu.apps.task2.strategies;

import ua.ucu.edu.apps.task2.Client;
import ua.ucu.edu.apps.task2.MailInfo;

public abstract class MailSender {
    private String message = "Nothing specific";

    public void sendMail(MailInfo info){
        Client cl = info.getCl();
        System.out.println("Message: " + this.message + 
        "was sent to client: " + cl.getName());
    }
}
