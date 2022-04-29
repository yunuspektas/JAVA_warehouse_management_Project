package OneDayTrip.Cinema;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static OneDayTrip.Cinema.Movie.movieMap;
import static OneDayTrip.Cinema.Room.roomMap;


public class TicketReservation {
    static Scanner scan = new Scanner(System.in);
    static double ticketprice = 0.0;
    static int numberOfTickets = 0;
    static List<Integer> asecilenKoltukNumaralari = new ArrayList<>(); // müsterinin sinema için seçtiği koltuklar
    static List<String> yemeIcmeList = new ArrayList<>(); // müsterini büfe adisyonu bu listede
    static List<String> izlenecekFilmler = new ArrayList<>(); // bilet hesaplama öncesi izlenmek için seçilen filmler

    public static void ticket() {


        Movie.listMovies();
        System.out.println(" ");
        int secim = 0;
        Movie.sira = 1;
        boolean bln = false;

        /* Eğer hata oluşursa doğru veri girilene kadar tekrar sayı iste */

        do {
            System.out.print("İzlemek istediğiniz filmin sira numarasını giriniz : ");
            try {
                /* Kullanıcıdan veri al */
                int secim1 = scan.nextInt();           // ! ***************************
                if(secim1 >0 && secim1< 6) {            // ! ***************************
                    secim = secim1;                     // ! ***************************
                    bln = true;                         // ! ***************************
                }else {                                 // ! ***************************e

                    System.out.println("!!! Giriş hatalı ");
                    ticket();
                }

            } catch (Exception e) {  /* Eğer veri yanlış formatta ise hata fırlat */

                System.out.println("Yanlış karakter girdiniz. Lütfen bir sayı girin;");
                scan.nextLine();        //dummy
            }

        } while (!bln);

        izlenecekFilmler.add(findFilm(secim));
        showRoom();
        System.out.println("");
        System.out.print("Film için Kaç bilet almak istiyorsunuz : ");
       // static int numberOfTickets = 0;
        scan.nextLine();        //dummy
        int ticketCount = scan.nextInt();  //**********************************
        numberOfTickets += ticketCount;
        scan.nextLine();        //dummy
        switch (secim) {
            case 1 -> {
                buyTicket("Room1", ticketCount, secim);

            }
            case 2 -> {
                buyTicket("Room2", ticketCount, secim);
            }
            case 3 -> {
                buyTicket("Room3", ticketCount, secim);
            }
            case 4 -> {
                buyTicket("Room4", ticketCount, secim);
            }
            case 5 -> {
                buyTicket("Room5", ticketCount, secim);
                System.out.println("");
            }
            default -> {
                System.out.println("!!! Hatalı giriş yaptınız");
                scan.nextLine();        //dummy
                ticket();
            }
        }
        System.out.println(" ");
        yemeIcme(numberOfTickets, secim);
    }

    private static void buyTicket(String room, int ticketCount, int secim) {
        koltukSecimi(ticketCount, secim);
        roomMap.get(room).secilenKoltukNumaralari.addAll(asecilenKoltukNumaralari);
        roomMap.get(room).setBosKoltukSayisi(roomMap.get(room).getBosKoltukSayisi() - numberOfTickets);
    }

    private static void yemeIcme(int numberOfTickets, int secim) {
        System.out.println("İçecek , yiyecek bişeyler almak ister misiniz ? \n1- Evet\n2- Hayır");
        switch (scan.nextInt()) {
            case 1: {

                yemeIcmeMenu(numberOfTickets, secim);
                break;
            }
            case 2: {
                ticketPrice(numberOfTickets, secim);
                break;
            }
            default: {
                System.out.println("!!! Hatalı giriş yaptınız ");
                ticketPrice(numberOfTickets, secim);

            }
        }
    }

    private static void yemeIcmeMenu(int numberOfTickets, int secim) {
       boolean bln = false ;
       do {
           System.out.println("*************   MENU   ****************");
           System.out.println("");
           System.out.println("1- Su       5 TL ");
           System.out.println("2- COLA     15 TL ");
           System.out.println("3- M.SUYU   10 TL ");
           System.out.println("4- CİPS     15 TL ");
           System.out.println("5- P.MISIR  15 TL ");
           System.out.println("6- ÇIKIŞ ");
           System.out.println("");
           try {
               int secim1 = scan.nextInt();
               if(secim >0 && secim < 7) {
                   switch (secim1) {
                       case 1: {
                           ticketprice += 5;
                           //System.out.println("ticketprice " + ticketprice);
                           yemeIcmeList.add("Su");
                           System.out.println("hesabınıza su eklendi..");
                           yemeIcmeMenu(numberOfTickets, secim);
                       }
                       case 2: {
                           ticketprice += 15;
                           yemeIcmeList.add("Cola");
                           System.out.println("hesabınıza cola eklendi..");
                           yemeIcmeMenu(numberOfTickets, secim);
                       }
                       case 3: {
                           ticketprice += 10;
                           yemeIcmeList.add("Meyve Suyu");
                           System.out.println("hesabınıza meyve suyu eklendi..");
                           yemeIcmeMenu(numberOfTickets, secim);
                       }
                       case 4: {
                           ticketprice += 15;
                           yemeIcmeList.add("Cips");
                           System.out.println("hesabınıza cips eklendi..");
                           yemeIcmeMenu(numberOfTickets, secim);
                       }
                       case 5: {
                           ticketprice += 15;
                           yemeIcmeList.add("Patlamış Mısır");
                           System.out.println("hesabınıza patlamış mısır eklendi..");
                           yemeIcmeMenu(numberOfTickets, secim);
                       }
                       case 6: {
                           ticketPrice(numberOfTickets, secim);
                       }
                       default: {
                           System.out.println("!!! Hatalı seçim yaptınız ");
                           yemeIcmeMenu(numberOfTickets, secim);
                       }
                   }

               } else {
                   System.out.println("seçim hatalı ");
                   yemeIcmeMenu(numberOfTickets, secim);
               }

           } catch (InputMismatchException e) {
               System.out.println("!!! Giriş hatası ");
               scan.nextLine();  // dummy
               //yemeIcmeMenu(numberOfTickets, secim);
           }

       } while (!bln);



    }

    //kullanıcının sectiği filmi map'den bulup getiren metod
    private static String findFilm(int secim) {
        String filmName = "";
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
            default -> {
                System.out.println("!!! Hatalı giriş yaptınız : ");
                findFilm(secim);
            }
        }
        return filmName;
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
            //scan.nextLine();
            int secilenKoltukNumarasi = scan.nextInt();
            if (koltukKontrol(secilenKoltukNumarasi, secim)) {
                //System.out.println("calıştı");
                asecilenKoltukNumaralari.add(secilenKoltukNumarasi);

            } else {
                System.out.println(" !! seçtiğiniz koltuk dolu !!");
                i--;
            }


        }
        System.out.println(" ");
        //ticketPrice(numberOfTickets, secim);
    }

    //nihai olarak bilet fiyatını hesaplayan metod
    private static void ticketPrice(int numberOfTickets, int secim) {
        System.out.println("");
        System.out.println("****************************************");
        System.out.println("               ADİSYONUNUZ              ");
        System.out.println("");
        System.out.println("");
        System.out.println("--> İzlemek istediğiniz film : ");
        System.out.println("==============================");
        //getFilm(secim);
        for (String w : izlenecekFilmler) {
            System.out.println("* " + w +"\n");

        }
        System.out.println("Toplam alınan bilet sayınız : " + numberOfTickets);
        System.out.println("");
        if (yemeIcmeList.size() > 0) {
            System.out.println("--> Büfe Alışverişiniz");
            System.out.println("======================");
            for (String str : yemeIcmeList) {
                System.out.println("* " + str);
            }
            System.out.println("");
        }
        ticketprice += 25 * numberOfTickets;
        System.out.println("Toplam bilet ücretiniz : " + ticketprice + " TL");
        System.out.println("");
        System.out.println("****************************************");

        System.out.println("1-Devam \n2-Çıkış");
        switch (scan.nextInt()) {
            case 1 -> {
                ticketprice -= 25*numberOfTickets ;  // !****************************
                ticket();
                break;
            }
            case 2 -> System.exit(0);
            default -> {
                System.out.println("!!! Hatalı giriş yaptınız");
                ticket();
            }
        }


    }

    // koltuk daha önce satılmış mı ?
    private static boolean koltukKontrol(int secilenKoltukNumarasi, int secim) {
        boolean flag = false;
        switch (secim) {
            case 1 -> {

                if (!roomMap.get("Room1").secilenKoltukNumaralari.contains(secilenKoltukNumarasi)) {
                    flag = true;

                }
                break;
            }
            case 2 -> {
                if (!roomMap.get("Room2").secilenKoltukNumaralari.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            case 3 -> {
                if (!roomMap.get("Room3").secilenKoltukNumaralari.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            case 4 -> {
                if (!roomMap.get("Room4").secilenKoltukNumaralari.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            case 5 -> {
                if (!roomMap.get("Room5").secilenKoltukNumaralari.contains(secilenKoltukNumarasi)) flag = true;
                break;
            }
            default -> {
                System.out.println("!!! hatalı giriş yaptınız");
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



