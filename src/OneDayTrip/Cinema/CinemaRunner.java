package OneDayTrip.Cinema;

public class CinemaRunner {

    public CinemaRunner() {
        Room.initializeRooms();
        Movie mv = new Movie();

        TicketReservation.banner();

        TicketReservation.ticket();
    }

//    public static void main(String[] args) {
//
//
//        Room.initializeRooms();
//        Movie mv = new Movie();
//
//        TicketReservation.banner();
//
//        TicketReservation.ticket();
//    }

}
