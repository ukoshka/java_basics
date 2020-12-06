import java.util.ArrayList;
import java.util.List;

class Boxes {
    public static void main(String[] args) {
        Toy carToy = new Toy("Car");
        Toy dollToy = new Toy("Doll");
        Toy teddyBearToy = new Toy("Teddy Bear");
        Food icecreamFood = new Food("Ice-cream");
        Food appleFood = new Food("Apple");
        Book sherlockBook = new Book("Sherlock Holmes");
        Book tomsawyerBook = new Book("Tom Sawyer");
        FantasyBook vampireBook = new FantasyBook("Dracula");
        FantasyBook shadowBook = new FantasyBook("Shadow");

//        Create boxes with Toys, Foods, Books and separate Box which accepts only Fantasy books.
        Box<Toy> toysBox = new Box<>();
        Box<Food> foodsBox = new Box<>();
        Box<Book> booksBox = new Box<>();
        Box<FantasyBook> fantasyBooksBox = new Box<>();

        toysBox.putItem(carToy);
        toysBox.putItem(dollToy);
        toysBox.putItem(teddyBearToy);
        foodsBox.putItem(icecreamFood);
        foodsBox.putItem(appleFood);
        booksBox.putItem(sherlockBook);
        booksBox.putItem(tomsawyerBook);
        fantasyBooksBox.putItem(vampireBook);
        fantasyBooksBox.putItem(shadowBook);
        System.out.println(toysBox);

//        Create Shelf, which can contain boxes with Toys only.
        Shelf<Toy> toysShelf = new Shelf<>();
        toysShelf.putBoxOnShelf(toysBox);
        System.out.println(toysShelf);

//        Create Shelf which can contains boxes with Books. Ensure, that it still accepts Boxes with Fantasy books as well.
        Shelf<Book> booksShelf = new Shelf<>();
        booksShelf.putBoxOnShelf(booksBox);
        booksShelf.putBoxOnShelf(fantasyBooksBox);
        System.out.println(booksShelf);

//        Create Shelf, which can contains boxes of any Item.
        Shelf<Item> itemsShelf = new Shelf<>();
        itemsShelf.putBoxOnShelf(toysBox);
        itemsShelf.putBoxOnShelf(foodsBox);
        itemsShelf.putBoxOnShelf(booksBox);
        itemsShelf.putBoxOnShelf(fantasyBooksBox);
        System.out.println(itemsShelf);
    }
}
