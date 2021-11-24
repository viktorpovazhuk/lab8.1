package mail_types;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    private MailBox box;
    private Client client1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        box = new MailBox();
        client1 = new Client("Serhii", 20, Gender.MALE);
        MailInfo mail1 = new MailInfo(client1, MailCode.HAPPY_BIRTHDAY);
        box.addMailInfo(mail1);
    }

    @org.junit.jupiter.api.Test
    void sendAll() {
        assertTrue(box.sendAll());
    }

    @org.junit.jupiter.api.Test
    void testName() {
        assertEquals("Serhii", client1.getName());
    }
}