package OneDayTrip.Restaurant;

import java.util.HashMap;
import java.util.Map;

public class Yemek {

    String name;
    Double price;
    static Map<Integer, Yemek> yemekMapım = new HashMap<>(); // yemek objelerimiz burada
    static int id = 8;

 public Yemek() {
     Yemek ymk1 = new Yemek("Margherita Pizza", 50.0);
     Yemek ymk2 = new Yemek("Adana Kebap", 30.0);
     Yemek ymk3 = new Yemek("Ramen", 40.0);
     Yemek ymk4 = new Yemek("Lomo saltado", 60.0);
     Yemek ymk5 = new Yemek("Döner", 25.0);
     Yemek ymk6 = new Yemek("Tacos al Pastor", 15.5);
     Yemek ymk7 = new Yemek("Keledoş", 30.0);
     yemekMapım.put(1, ymk1);
     yemekMapım.put(2, ymk2);
     yemekMapım.put(3, ymk3);
     yemekMapım.put(4, ymk4);
     yemekMapım.put(5, ymk5);
     yemekMapım.put(6, ymk6);
     yemekMapım.put(7, ymk7);


 }

 public Yemek(String name, Double price) {
     this.name = name;
     this.price = price;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public Double getPrice() {
     return price;
 }

 public void setPrice(Double price) {
        this.price = price;
    }


}
