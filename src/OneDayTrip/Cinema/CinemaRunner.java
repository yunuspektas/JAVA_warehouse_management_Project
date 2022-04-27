package OneDayTrip.Cinema;

public class CinemaRunner {

    public static void main(String[] args) {
        Room.initializeRooms();
        Movie mv = new Movie();

        TicketReservation.banner();

        TicketReservation.ticket();
    }

}
