public class Book extends Item{
    public String author;

    public Book(String name, String author, int year) {
        super(name, year);
        this.author = author;
    }

    public String toString() {
        return super.toString() + " Author:" + author + " Category:Book" ;
    }
}
