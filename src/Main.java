import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initializing Movie cast
        ArrayList<String> movieCast = new ArrayList<>();
        movieCast.add("Johnny Depp");
        movieCast.add("Elizabeth Swan");

        // Initialize TV cast
        ArrayList<String> tvShowCast = new ArrayList<>();
        tvShowCast.add("Dule Hill");
        tvShowCast.add("James Rodriguez");

        // Creating a Movie instance
        Movie movie = new Movie("Pirates of The Caribbean", "PG-13", "Gore Verbinski", movieCast, 223, "A comedic adventure story", 654.3);
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Movie Grossing: $" + movie.getGrossing() + " million");

        // Creating a TvShow instance
        TvShow tvShow = new TvShow("Psych", "PG-13", "Steve Franks", tvShowCast, 9, 120 );
        System.out.println("TV Show Title: " + tvShow.getTitle());
        System.out.println("TV Show Seasons: " + tvShow.getSeasons());
    }
}
