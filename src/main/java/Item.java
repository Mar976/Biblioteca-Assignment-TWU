public class Item {

    public String name;
    public int year;
    public boolean availability;

    public Item(String name, int year) {
        this.name = name;
        this.year = year;
        this.availability = true;
    }

    public String toString() {
        return "Available:" + availability  + " Name:" + name + " Year:" + year;
    }
}
