package image;

import java.util.concurrent.TimeUnit;

public class RealImage implements Image {
    public String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() throws InterruptedException {
        this.loadFromDisk();
        System.out.println("Displayed");
    }

    public void loadFromDisk() throws InterruptedException {
        System.out.println("Loading from disk...");
        TimeUnit.SECONDS.sleep(5);
    }
}
