public class Item {

    public String name;
    public int year;
    public boolean availability;
    public int id;

    public Item(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.availability = true;
    }

    public String createItem() {
        return "Available:" +availability + " ID:" + id + " Name:" + name + " Year" + year;
    }

    public String getAuthor() {
        return " ";
    }


    public String getDirector() {
        return "";
    }


    public double getRating() {
        return 0.0;
    }
}
