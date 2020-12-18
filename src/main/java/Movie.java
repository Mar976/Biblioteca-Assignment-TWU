public class Movie extends Item{
    public String name;
    public int year;
    public String director;
    public double rating;
    public boolean availability;
    public int id;

    public Movie(int id, String name, int year, String director, double rating) {
        super(id, name, year);
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String createItem() {
        return super.createItem() + " Director:" + director + " Rating:" + rating + " Category:Movie" ;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public double getRating() {
        return rating;
    }

}