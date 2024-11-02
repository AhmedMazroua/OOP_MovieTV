import java.util.ArrayList;

public class Media {
    private String title;
    private String rating;
    private String director;
    private ArrayList<String> cast;

    // Constructor
    public Media(String title, String rating, String director, ArrayList<String> cast) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.cast = cast;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }
}
