package OneDayTrip.Restaurant;

import java.util.HashMap;
import java.util.Map;

public class Icecek {


    static String name;
    static double price;
    static int id = 8;
    static Map<Integer, Icecek> ıcecekMapım = new HashMap<>(); // ıcecek objelerimiz burada

    public Icecek() {

        Icecek ıck1 = new Icecek("Caffè Americano", 80.0);
        Icecek ıck2 = new Icecek("Turk kahvesi", 70.0);
        Icecek ıck3 = new Icecek("Royal Milk Tea", 60.0);
        Icecek ıck4 = new Icecek("Limonada Peruana", 50.0);
        Icecek ıck5 = new Icecek("Kefir", 40.0);
        Icecek ıck6 = new Icecek("Paloma", 80.0);
        Icecek ıck7 = new Icecek("çay", 100.0);
        ıcecekMapım.put(1, ıck1);
        ıcecekMapım.put(2, ıck2);
        ıcecekMapım.put(3, ıck3);
        ıcecekMapım.put(4, ıck4);
        ıcecekMapım.put(5, ıck5);
        ıcecekMapım.put(6, ıck6);
        ıcecekMapım.put(7, ıck7);
    }

    public Icecek(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Icecek.name = name;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Icecek.price = price;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Icecek.id = id;
    }

    public static Map<Integer, Icecek> getIcecekMapım() {
        return ıcecekMapım;
    }

    public static void setIcecekMapım(Map<Integer, Icecek> ıcecekMapım) {
        Icecek.ıcecekMapım = ıcecekMapım;
    }


}
