package image;

public class ProxyPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        ProxyImage pi = new ProxyImage("image.png");
        pi.display();
        pi.display();
    }
}
