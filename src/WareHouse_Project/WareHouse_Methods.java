package WareHouse_Project;

import java.util.Scanner;

import static WareHouse_Project.Products.itemMap;
import static WareHouse_Project.Products.keySet;


public class WareHouse_Methods {

    static int id = 1005;
    static Scanner scan = new Scanner(System.in);


    public static void defineItem() {
        System.out.print("Ürün ismini giriniz : ");
        String itemName = scan.next();

        System.out.print("Üretici Firma ismini giriniz : ");
        String manifacturer = scan.next();

        System.out.print("Birimi giriniz : ");
        String unit = scan.next();

        Products item1 = new Products(itemName, manifacturer, 0, unit, "null");
        itemMap.put(id, item1);
        keySet.add(id);
        id++;


    }

    public static void listItems() {

        System.out.println("");
        System.out.printf("\t%-8s %-10s %-15s %-12s %-10s %-7s\n", "ID", "NAME", "MANUFACTURER"
                , "QUANTITY", "UNIT", "SHELF");
        System.out.println("=========================================================================");
        //System.out.println(keySet.size());
        for (int i = 0; i <keySet.size() ; i++) {

            System.out.printf("\t%-8s %-10s %-15s %-12s %-10s %-7s\n", keySet.get(i),
                    itemMap.get(keySet.get(i)).getProductName(),
                    itemMap.get(keySet.get(i)).getManufacturer(),
                    itemMap.get(keySet.get(i)).getQuantity(),
                    itemMap.get(keySet.get(i)).getUnit(),
                    itemMap.get(keySet.get(i)).getShelfNo());

        }



    }

    public static void addItem(){
        System.out.print("Girmek istediğiniz ürün id sini giriniz : ");
        int is = scan.nextInt();
        if(itemMap.containsKey(is)) {
            System.out.print("Ne kadar giriş yapmak istiyorsunuz : ");
            itemMap.get(is).setQuantity(itemMap.get(is).getQuantity() + scan.nextInt());
        } else {
            System.out.println("");
            System.out.println("!!! Girdiğiniz id sistemimizde bulunmamaktadır !!!");
        }
    }

    public static void puttingItemToShelf(){
        // id ye göre objeyi getiren mthod yazalşım burada
        System.out.print("Ürünün id sini giriniz : ");
        int is = scan.nextInt();
        if(itemMap.containsKey(is)) {
            System.out.print("Hangi rafa koymak istiyorsunuz : ");
            itemMap.get(is).setShelfNo(scan.next());
        } else {
            System.out.println("!!! Girdiğiniz id sistemimizde bulunmamaktadır !!!");
        }

    }

    public static void exitItem(){

        System.out.print("Ürünün id sini giriniz : ");
        int is = scan.nextInt();
        if(itemMap.containsKey(is)) {
            System.out.print("Ne kadar çıkış yapmak istiyorsunuz : ");
            itemMap.get(is).setQuantity(itemMap.get(is).getQuantity() - scan.nextInt());
        } else {
            System.out.println("Girdiğiniz id sistemimizde bulunmamaktadır");
        }

    }

    public static void exit(){
        System.exit(0);
    }


}
