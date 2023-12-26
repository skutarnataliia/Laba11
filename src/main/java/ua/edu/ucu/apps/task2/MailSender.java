package ua.edu.ucu.apps.task2;

public class MailSender {
    private SenderStrategy strategy;

    public void sendMail(MailInfo info) {
        if (info.getMailCode() == MailCode.GIFT) {
            this.strategy = new GiftMailSender();
        }
        if (info.getMailCode() == MailCode.BIRTHDAY) {
            this.strategy = new BirthdayMailSender();
        }
    }
}
