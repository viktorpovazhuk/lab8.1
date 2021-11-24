package mail_types;

public class MailSender {
    public static boolean sendMail(MailInfo mailInfo) {
        String mailText = mailInfo.getMailText();
        System.out.println("Next mail is sent:\n" + mailText);
        return true;
    }
}
