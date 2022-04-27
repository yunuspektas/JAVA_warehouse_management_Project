package OneDayTrip.Cinema;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static OneDayTrip.Cinema.Room.roomMap;

public class Movie {
    static Map<String, Movie> movieMap = new TreeMap<>();
    static int sira = 1;
    private String movieName;
    private String movieDuration;
    private String movieRoomNo;
    private String movieGenre;  // action, Crime , Drama
    private String[] movieSession;


    public Movie() {
        Movie movie1 = new Movie("The Batman", "2.30", "Room1", "Action", new String[]{"10:00", "13:00", "16:00", "19:00", "22:00"});
        Movie movie2 = new Movie("The North Man", "1.30", "Room2", "Adventure", new String[]{"10:00", "13:00", "16:00", "19:00", "22:00"});
        Movie movie3 = new Movie("Peaky Blinders", "2.00", "Room3", "Crime", new String[]{"10:00", "13:00", "16:00", "19:00", "22:00"});
        Movie movie4 = new Movie("Dune", "1.45", "Room4", "Adventure", new String[]{"10:00", "13:00", "16:00", "19:00", "22:00"});
        Movie movie5 = new Movie("The Lego", "2.30", "Room5", "Animation", new String[]{"10:00", "13:00", "16:00", "19:00", "22:00"});
        movieMap.put("movie1", movie1);
        movieMap.put("movie2", movie2);
        movieMap.put("movie3", movie3);
        movieMap.put("movie4", movie4);
        movieMap.put("movie5", movie5);

    }

    public Movie(String movieName, String movieDuration, String movieRoomNo, String movieGenre, String[] movieSession) {
        this.movieName = movieName;
        this.movieDuration = movieDuration;
        this.movieRoomNo = movieRoomNo;
        this.movieGenre = movieGenre;
        this.movieSession = movieSession;
    }

    public static void listMovies() {
        System.out.printf("\t%-20s %-14s %-10s %-10s %-7s \n", "MOVIE", "GENRE",
                "DURATION", "ROOM NO", "AVAILABLE");
        System.out.println("==========================================================================");
        for (Movie mov : movieMap.values()) {
            System.out.println(" ");
            System.out.printf("\t%-20s %-14s %-10s %-10s %-7s \n", sira + "- " + mov.getMovieName(), mov.getMovieGenre(),
                    mov.getMovieDuration(), mov.getMovieRoomNo(), roomMap.get(mov.getMovieRoomNo()).getBosKoltukSayisi());
            sira++;
        }

    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDuration() {
        return movieDuration;
    }

    public String getMovieRoomNo() {
        return movieRoomNo;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String[] getMovieSession() {
        return movieSession;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieDuration='" + movieDuration + '\'' +
                ", movieRoomNo='" + movieRoomNo + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", movieSession=" + Arrays.toString(movieSession) +
                '}';
    }
}
