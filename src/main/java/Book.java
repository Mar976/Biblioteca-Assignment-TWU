public class Book extends Item{
    public String author;

    public Book(int id, String name, String author, int year) {
        super(name, year);
        this.author = author;
    }

    @Override
    public String createItem() {
        return super.createItem() + " Author:" + author + " Category:Book" ;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
