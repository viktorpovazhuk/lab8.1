package mail_types;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();
    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }
    public boolean sendAll() {
        for (MailInfo info: infos) {
            MailSender.sendMail(info);
        }
        return true;
    }
}
