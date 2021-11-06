package dp.structural.proxy.ex2;

/**
 * The Proxy pattern is used when we want to limit the capabilities and the functionalities of a class, by using
 * another class which limits it.
 * <p>
 * By using this proxy class, the client uses the interface it defines, to access the original class. This ensures that
 * the client can't do anything out of order with the original class since all of his requests pass through our proxy class.
 */
interface MediaFile {
    void printName();
}

class MediaFileImpl implements MediaFile {
    private String fileName;

    public MediaFileImpl(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void printName() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

class ProxyMediaFile implements MediaFile {

    private MediaFileImpl mediaFileImpl;
    private String fileName;

    public ProxyMediaFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printName() {
        if (mediaFileImpl == null) {
            mediaFileImpl = new MediaFileImpl(fileName);
        }
        mediaFileImpl.printName();
    }
}

public class ProxyPattern {


    public static void main(String[] args) {

        MediaFile mediaFile = new ProxyMediaFile("movie.mp4");

        mediaFile.printName();
        mediaFile.printName();
    }
}
/*
Loading movie.mp4
Displaying movie.mp4
Displaying movie.mp4
 */