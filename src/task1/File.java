package task1;

/**
 * Created by sergey.kliepikov on 3/20/18.
 */
public class File extends NamedFSItem {

    private final int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                '}';
    }
}
