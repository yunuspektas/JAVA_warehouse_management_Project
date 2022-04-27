package OneDayTrip.Cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static OneDayTrip.Cinema.Movie.movieMap;
import static OneDayTrip.Cinema.Room.roomMap;


public class TicketReservation {
    static Scanner scan = new Scanner(System.in);
    static double ticketprice = 0.0 ;
    static List<Integer> asecilenKoltukNumaraları = new ArrayList<>();
    static List<String> izlenecekFilmler = new ArrayList<>(); // bilet hesaplama öncesi izlenmek için seçilen filmler

    public static void ticket() {


        Movie.listMovies();
        System.out.println(" ");

        Movie.sira = 1;
        System.out.print("İzlemek istediğiniz filmin sira numarasını giriniz : ");
        int secim = scan.nextInt();
        izlenecekFilmler.add(findFilm(secim));
        showRoom();
        System.out.println("");
        System.out.print("Film için Kaç bilet almak istiyorsunuz : ");
        int numberOfTickets = scan.nextInt();
        switch (secim) {
            case 1 -> {
                koltukSecimi(numberOfTickets, secim);
                roomMap.get("Room1").secilenKoltukNumaraları.addAll(asecilenKoltukNumaraları);
                roomMap.get("Room1").setBosKoltukSayisi(roomMap.get("Room1").getBosKoltukSayisi() - numberOfTickets);
                System.out.print("Seçtiğiniz koltuk numaraları : ");
                for (int w : roomMap.get("Room1").getSecilenKoltukNumaraları()) {
                    System.out.print(w + " / ");
                }
                break;
            }
            case 2 -> {
                koltukSecimi(numberOfTickets, secim);
                roomMap.get("Room2").secilenKoltukNumaraları.addAll(asecilenKoltukNumaraları);
                roomMap.get("Room2").setBosKoltukSayisi(roomMap.get("Room2").getBosKoltukSayisi() - numberOfTickets);
                System.out.print("Seçtiğiniz koltuk numaraları : ");

                for (int w : roomMap.get("Room2").getSecilenKoltukNumaraları()) {
                    System.out.print(w + " / ");
                }

                break;
            }
            case 3 -> {
                koltukSecimi(numberOfTickets, secim);
                roomMap.get("Room3").secilenKoltukNumaraları.addAll(asecilenKoltukNumaraları);
                roomMap.get("Room3").setBosKoltukSayisi(roomMap.get("Room3").getBosKoltukSayisi() - numberOfTickets);
                System.out.print("Seçtiğiniz koltuk numaraları : ");

                for (int w : roomMap.get("Room3").getSecilenKoltukNumaraları()) {
                    System.out.print(w + " / ");
                }
                break;
            }
            case 4 -> {
                koltukSecimi(numberOfTickets, secim);
                roomMap.get("Room4").secilenKoltukNumaraları.addAll(asecilenKoltukNumaraları);
                roomMap.get("Room4").setBosKoltukSayisi(roomMap.get("Room4").getBosKoltukSayisi() - numberOfTickets);

                System.out.print("Seçtiğiniz koltuk numaraları : ");

                for (int w : roomMap.get("Room4").getSecilenKoltukNumaraları()) {
                    System.out.print(w + " / ");
                }
                break;
            }
            case 5 -> {
                koltukSecimi(numberOfTickets, secim);
                roomMap.get("Room5").secilenKoltukNumaraları.addAll(asecilenKoltukNumaraları);
                roomMap.get("Room5").setBosKoltukSayisi(roomMap.get("Room5").getBosKoltukSayisi() - numberOfTickets);
                System.out.print("Seçtiğiniz koltuk numaraları : ");

                for (int w : roomMap.get("Room5").getSecilenKoltukNumaraları()) {
                    System.out.print(w + " / ");
                }
                System.out.println("");
                break;
            }
        }
        System.out.println(" ");
        ticket();


    }

    //kullanıcının sectiği filmi mapden bulup getiren metod
    private static String findFilm(int secim) {
        String filmName = "" ;
        switch (secim) {
            case 1 -> {
                filmName = movieMap.get("movie1").getMovieName();
                break;
            }
            case 2 -> {
                filmName = movieMap.get("movie2").getMovieName();
                break;
            }
            case 3 -> {
                filmName = movieMap.get("movie3").getMovieName();
                break;
            }
            case 4 -> {
                filmName = movieMap.get("movie4").getMovieName();
                break;
            }
            case 5 -> {
                filmName = movieMap.get("movie5").getMovieName();
                break;
            }
        }
        return filmName ;
    }

    //seçilen sinema salonunun koltuklarını ekrana gösteren metod
    private static void showRoom() {
        System.out.println
                ("""
                                     -----------------------------------------------------------
                                                               PERDE
                                     -----------------------------------------------------------
                        """);

        for (int i = 1; i <= 9; i++) {
            System.out.printf("\t\t%-8s", "| 0" + i + " |");
            if (i % 5 == 0) System.out.println("");
        }
        for (int i = 10; i <= 25; i++) {
            System.out.printf("\t\t%-8s", "| " + i + " |");
            if (i % 5 == 0) System.out.println("");
        }
    }

    private static void koltukSecimi(int numberOfTickets, int secim) {
        for (int i = 0; i < numberOfTickets; i++) {
            System.out.print("Bilet almak istediğiniz " + (i + 1) + ". koltuğu seçiniz : ");
            scan.nextLine();
            int secilenKoltukNumarasi = scan.nextInt();
            if (koltukKontrol(secilenKoltukNumarasi, secim)) {
                asecilenKoltukNumaraları.add(secilenKoltukNumarasi);

            } else {
                System.out.println("seçtiğiniz koltuk dolu");
                i--;
            }


        }
        System.out.println(" ");
        ticketPrice(numberOfTickets, secim);
    }

    //nihai olarak bilet fiyatını hesaplayan metod
    private static void ticketPrice(int numberOfTickets, int secim) {
        System.out.println("");
        System.out.println("****************************************");
        System.out.println("");
        System.out.println("İzlemek istediğiniz film : " );
        //getFilm(secim);
        for (String w : izlenecekFilmler) {
            System.out.println("* " + w + "\n");
        }
        ticketprice += 25*numberOfTickets;
        System.out.println("Toplam bilet ücretiniz : " + ticketprice + " TL");
        System.out.println("");
        System.out.println("****************************************");

        System.out.println("1-Devam \n2-Çıkış");
        switch (scan.nextInt()) {
            case 1 -> {
                ticket();
                break;
            }
            case 2 -> System.exit(0);
        }


    }

    // koltuk daha önce satılmış mı ?
    private static boolean koltukKontrol(int secilenKoltukNumarasi, int secim) {
        boolean flag = false;
        switch (secim) {
            case 1: {

                if (!roomMap.get("Room1").secilenKoltukNumaraları.contains(secilenKoltukNumarasi)) {
                    flag = true;

                }
                break;
            }
            case 2: {
                if (!roomMap.get("Room2").secilenKoltukNumaraları.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            case 3: {
                if (!roomMap.get("Room3").secilenKoltukNumaraları.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            case 4: {
                if (!roomMap.get("Room4").secilenKoltukNumaraları.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            case 5: {
                if (!roomMap.get("Room5").secilenKoltukNumaraları.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            default: {
                System.out.println("hata");
            }
        }

        return flag;
    }

    // açılış logo ekranı
    public static void banner() {
        System.out.println("\n\n");
        System.out.println("\t\t\t================================================");
        System.out.println("\t\t\t|          WELCOME  ArtOfCoding  CINEMA        |");
        System.out.println("\t\t\t================================================");
        System.out.println(" ");
        System.out.println("\t\t... Vizyonda olan filmleri listeden seçebilirsiniz ...");
        System.out.println("... Salonda kalan koltuk sayısını AVAILABLE sekmesinden görebilirsiniz ...");
        System.out.println("");

    }
}



