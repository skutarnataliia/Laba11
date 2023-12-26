package ua.edu.ucu.apps.task2;

public class GiftMailSender implements SenderStrategy{
    @Override
    public void sendMail(Client client) {
        System.out.println("Dear " + client.getName() + ", you received a gift!");
    }
}
