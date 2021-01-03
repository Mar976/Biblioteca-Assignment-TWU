public class Movie extends Item{
    public String director;
    public double rating;

    public Movie(String name, int year, String director, double rating) {
        super(name, year);
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return super.toString() + " Director:" + director + " Rating:" + rating + " Category:Movie" ;
    }
}
