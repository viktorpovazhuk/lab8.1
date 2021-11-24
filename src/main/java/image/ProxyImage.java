package image;

public class ProxyImage implements Image{
    public RealImage realImage;
    public String fileName;
    private boolean cached = false;

    public ProxyImage(String fileName) {
        realImage = new RealImage(fileName);
    }

    @Override
    public void display() throws InterruptedException {
        if (cached) {
            System.out.println("Displayed immediately for 2 time");
            return;
        }
        realImage.display();
        System.out.println("Caching image...");
        System.out.println("Cached");
        cached = true;
    }
}
