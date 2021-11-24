package mail_types;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        MailBox box = new MailBox();
        Client client1 = new Client("Serhii", 20, Gender.MALE);
        MailInfo mail1 = new MailInfo(client1, MailCode.HAPPY_BIRTHDAY);
        box.addMailInfo(mail1);
        box.sendAll();
    }
}
