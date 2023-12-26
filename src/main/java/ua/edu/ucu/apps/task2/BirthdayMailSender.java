package ua.edu.ucu.apps.task2;

public class BirthdayMailSender implements SenderStrategy{
    @Override
    public void sendMail(Client client) {
        System.out.println("Happy" + client.getAge() + "Birthday!" + client.getName());
    }
}
