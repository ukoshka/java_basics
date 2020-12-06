import java.util.ArrayList;
import java.util.List;

class Shelf<U> {
    List<Box<? extends U>> boxes;
    Shelf() { this.boxes = new ArrayList<>(); }
    void putBoxOnShelf(Box<? extends U> box) { boxes.add(box); }

    @Override
    public String toString() {
        return "Shelf{" +
                "boxes=" + boxes +
                '}';
    }
}