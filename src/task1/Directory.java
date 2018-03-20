package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.kliepikov on 3/20/18.
 */
public class Directory extends NamedFSItem {

    private List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FSItem item) {
        items.add(item);
        if(item instanceof Directory) throw new IllegalArgumentException("Directory under directory!");
    }

    public Directory addFluent(FSItem item) {
        items.add(item);
        if(item instanceof Directory) throw new IllegalArgumentException("Directory under directory!");
        return this;
    }

    public int getSize() {
        int counter = 0;
        for (FSItem item : items) {
            counter += item.getSize();
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "items=" + items +
                '}';
    }
}
