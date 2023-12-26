package ua.edu.ucu.apps.task2;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    
    public void addMailInfo(MailInfo info) {
        this.infos.add(info);
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo info : this.infos) {
            sender.sendMail(info);
        }
    }
}
