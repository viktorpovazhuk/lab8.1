package mail_types;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Hello, %NAME%!\n");

        Path currentRelativePath = Paths.get("data/" + filename);
        String absPath = currentRelativePath.toAbsolutePath().toString();
        File file = new File(absPath);

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                stringBuffer.append(line).append("\n");
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        stringBuffer.append("Yours system!\n");

        return stringBuffer.toString();
    }
}
