package task1;

/**
 * Created by sergey.kliepikov on 3/20/18.
 */
public class Symlink implements FSItem{

    private String symlinkName;
    private FSItem item;

    public Symlink(String symlinkName, FSItem item) {
        this.symlinkName = symlinkName;
        this.item = item;
    }

    @Override
    public String getName() {
        return symlinkName + " -> " + item.getName();
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "Symlink{" +
                "symlinkName='" + symlinkName + '\'' +
                ", item=" + item +
                '}';
    }
}
