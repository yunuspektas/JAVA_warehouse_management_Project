package OneDayTrip.Restaurant;


import OneDayTrip.Cinema.CinemaRunner;

import java.util.*;

import static OneDayTrip.Restaurant.Icecek.ıcecekMapım;
import static OneDayTrip.Restaurant.Yemek.yemekMapım;

public class IslemYap {
    static double fatura = 0.0;
    static double bahsis = 0.0;
    static Scanner scan = new Scanner(System.in);
    public static List<Yemek> yemekList = new ArrayList<>();// müşterinin yediği yemeklerin Listi
    public static List<Icecek> ıcecekList = new ArrayList<>();// müşterinin yediği CECEKLERİN Listi
    public static Integer id;

    //!!!!!!!!!!!!!!!!!!!!!
    public static void SecımYap() {
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("****   Lütfen Yapmak Istediğiniz Işlemi Seçiniz   *****" );
        System.out.println("=======================================================");
        System.out.println("\n1- Restaurant\n2- Sinema\n");

        String ıslem = scan.next();
        switch (ıslem) {
            case "1":
                new RestaurantRunner();
                break;
            case "2":
                new CinemaRunner();
                break;
            default:
                System.out.println("");
        }
    }

    public static void Restaurant() {
        System.out.println("************** Tercihiniz harika olacak ****************");
        System.out.println("lütfen yemeğinizi seçiniz");
        System.out.println(" ");
        System.out.println("Menümüzde bulunan çeşitler :\n1-Margherita Pizza – İtalya\n2-Adana Kebap – Türkiye\n3-Ramen – Japonya\n4-Lomo saltado – Peru\n5-Döner – Türkiye\n6-Tacos al Pastor – Meksika\n7-Keledoş-Van;-)");

        System.out.println("");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Italya'nın en lezzettli yemeğidir");
                yemekList.add(yemekMapım.get(1));       // yemekListin içine ymk1 (pizza) objemi ekledim
                break;
            case 2:
                System.out.println("Kebap candir efendim;-)");
                yemekList.add(yemekMapım.get(2));
                break;
            case 3:
                System.out.println("Hiç denemedim güzel olabilir?");
                yemekList.add(yemekMapım.get(3));
                break;
            case 4:
                System.out.println("Lomo saltado peru'kimse yiyemez.Elit işidir");
                yemekList.add(yemekMapım.get(4));
                break;
            case 5:
                System.out.println("doneri bulan banada haber etsin");
                yemekList.add(yemekMapım.get(5));
                break;
            case 6:
                System.out.println("Tacos al Pastor !!! dikkat ;yabancı madde çıkabılır");
                yemekList.add(yemekMapım.get(6));
                break;
            case 7:
                System.out.println("Van'nın yemekleri candır gerisi  heyecandır ");
                yemekList.add(yemekMapım.get(7));
                break;
            default:
                System.out.println("bunları ıstemıyorsanız  diğer tarafa bilet alın ");

        }
        System.out.println("");
        icecek();

    }

    private static void icecek() {
        System.out.println("***** İçecek istermisiniz ****** \n1-Evet\n2-Hayır ");
        if (scan.nextInt() == 1) {
            System.out.println("****** lütfen içecek seçiniz *****");
            System.out.println("Menümüzde bulunan çeşitler :\n1-Caffè Americano – İtalya\n2-Turk kahvesi – Türkiye\n3-Royal Milk Tea – Japonya\n4-Limonada Peruana – Peru\n5-Kefir– Türkiye\n6-Paloma – Meksika\n7-çay-Van;-)");
            System.out.println("************** Tercihiniz harika olacak *************");

            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Italya'nın en lezzettli İçeceğidir");
                    ıcecekList.add(ıcecekMapım.get(1)); // içecekListinm içine ymk1  objemi ekledim
                    break;
                case 2:
                    System.out.println("turk kahvesi muhteşemdir efendim;-)");
                    ıcecekList.add(ıcecekMapım.get(2));
                    break;
                case 3:
                    System.out.println("Hiç denemedim güzel olabilir?");
                    ıcecekList.add(ıcecekMapım.get(3));
                    break;
                case 4:
                    System.out.println("Limonada Peruana harikadır p");
                    ıcecekList.add(ıcecekMapım.get(4));
                    break;
                case 5:
                    System.out.println("Kefir içen bir daha içer");
                    ıcecekList.add(ıcecekMapım.get(5));
                    break;
                case 6:
                    System.out.println("Paloma !!! dikkat uçurabilir;-)");
                    ıcecekList.add(ıcecekMapım.get(6));
                    break;
                case 7:
                    System.out.println("Van kaçak çay  candır gerisi lafıguzar");
                    ıcecekList.add(ıcecekMapım.get(7));
                    break;
                default:
                    System.out.println("bunları ıstemıyorsanız eğer ikileyin ");

            }
            GarsonaBahsısBırak();
        } else System.out.println("peki siz bilirsiniz");

    }

    public static void HesapIste() {
        System.out.println("******  HESABINIZ  *******");
        System.out.println("");
        fatura += yemekList.get(0).getPrice() + ıcecekList.get(0).getPrice();
        System.out.println("1- " + yemekList.get(0).getName() + " " + yemekList.get(0).getPrice());
        System.out.println("2- " + ıcecekList.get(0).getName() + " " + ıcecekList.get(0).getPrice());

        if (bahsis > 0.0) {
            System.out.println("3- Bahsis " + bahsis);
        }
        System.out.println("");
        System.out.println("*****************************");
        System.out.println("");
        System.out.println("Toplam Faturanız : " + fatura);
    }

    public static void GarsonaBahsısBırak() {
        System.out.println("Garsona Bahsis bırakmak ister misiniz ? \n1- Evet \n2- Hayır  ");
        switch (scan.nextInt()) {
            case 1: {
                bahsis();
                HesapIste(); // clean
                break;
            }
            case 2: {
                HesapIste(); //clean
                break;
            }
            default: {
                System.out.println("!! Giriş hatalı");
                // GarsonaBahsısBırak();
            }
        }
    }

    public static void bahsis() {
        System.out.println("Bırakmak istediğiniz bahşiş miktarını giriniz : ");
        bahsis = scan.nextDouble();
        fatura += bahsis;
    }
}
