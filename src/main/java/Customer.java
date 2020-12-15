import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    public void addBooks(Book book) {
        books.add(book);
    }

    public void printBooks() {

    }
}