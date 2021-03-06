package zaj18_04_and_05_04_Patterns.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
