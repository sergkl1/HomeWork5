package task1;

/**
 * Created by sergey.kliepikov on 3/20/18.
 */
abstract public class NamedFSItem implements FSItem {
    private String name;

    public NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
