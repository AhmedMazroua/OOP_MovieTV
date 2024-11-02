import java.util.ArrayList;

public class TvShow extends Media {
    private int seasons;
    private int episodes;

    // Constructor
    public TvShow(String title, String rating, String director, ArrayList<String> cast, int seasons, int episodes) {
        super(title, rating, director, cast);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    // Getters and Setters
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
