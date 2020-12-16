public class Item {
    private String title;
    private String author;
    private int year;
    private boolean avaibality;

    public Item(String title, String author, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        avaibality = true;
    }

    public String getAuthor() { return author;}
    public String getTitle() { return title;}
    public int getYear() { return year;}

    public boolean ItemIsEqualTo (Item item) {
        return title.equalsIgnoreCase(item.title) && author.equalsIgnoreCase(item.author) && year==item.year;
    }

    public String printItem() {
        return title + " " + author+ " " + year + " " + avaibality;
    }

    public boolean getAvaiblity() {
        return avaibality;
    }

    public void setAvaibality(boolean newAvaibality) {
        avaibality = newAvaibality;
    }
}
