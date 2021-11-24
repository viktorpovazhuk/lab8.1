package mail_types;

import java.util.HashMap;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

    public String getMailText() {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());

        for (String template: templates.keySet()) {
            text = text.replace(template, templates.get(template));
        }

        return text;
    }
}
