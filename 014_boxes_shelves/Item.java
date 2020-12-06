abstract class Item {
    String name;
    Item(String name) { this.name = name; }

    @Override
    public String toString() {
        String className = this.getClass().getName();
        return className + "{" +
                "name='" + name + '\'' +
                '}';
    }
}