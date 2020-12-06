import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> items;
    Box() { this.items = new ArrayList<T>(); }

    void putItem(T item) {
        items.add(item);
    }

    List<T> getItems() { return items; }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}