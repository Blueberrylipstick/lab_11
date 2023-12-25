package ua.ucu.edu.apps.task2;

import lombok.SneakyThrows;
import ua.ucu.edu.apps.task2.strategies.BirthdaySender;
import ua.ucu.edu.apps.task2.strategies.GiftSender;
import ua.ucu.edu.apps.task2.strategies.MailSender;

import java.util.Arrays;
import java.util.List;

public class MailFactory {
    private static List<Class<? extends MailSender>> mails = Arrays.asList(BirthdaySender.class, GiftSender.class);

    @SneakyThrows
    public static void getMail(MailInfo info) {
        MailSender sending = mails.get(info.getMailCode()).newInstance();
        sending.sendMail(info);
    }
}
