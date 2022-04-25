package WareHouse_Project;

import java.util.Scanner;

import static WareHouse_Project.Products.itemMap;
import static WareHouse_Project.Products.keySet;


public class WareHouse_Methods {

    static int id = 1005;
    static Scanner scan = new Scanner(System.in);


    public static void defineItem() {
        System.out.print("Ürün ismini giriniz : ");
        String itemName = TryCach.stringGirisi();

        System.out.print("Üretici Firma ismini giriniz : ");
        String manifacturer = TryCach.stringGirisi();

        System.out.print("Birimi giriniz : ");
        String unit = TryCach.stringGirisi();

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
        for (Integer integer : keySet) {

            System.out.printf("\t%-8s %-10s %-15s %-12s %-10s %-7s\n", integer,
                    itemMap.get(integer).getProductName(),
                    itemMap.get(integer).getManufacturer(),
                    itemMap.get(integer).getQuantity(),
                    itemMap.get(integer).getUnit(),
                    itemMap.get(integer).getShelfNo());

        }



    }

    public static void addItem(){
        System.out.print("Girmek istediğiniz ürün id sini giriniz : ");
        int is = TryCach.intGirisi();
        if(itemMap.containsKey(is)) {
            System.out.print("Ne kadar giriş yapmak istiyorsunuz : ");
            itemMap.get(is).setQuantity(itemMap.get(is).getQuantity() + scan.nextInt());
        } else {
            System.out.println("");
            System.out.println("!!! Girdiğiniz id sistemimizde bulunmamaktadır !!!");
        }
    }

    public static void putItemToShelf(){
        // id ye göre objeyi getiren mthod yazalşım burada
        System.out.print("Ürünün id sini giriniz : ");
        int is = TryCach.intGirisi();
        if(itemMap.containsKey(is)) {
            System.out.print("Hangi rafa koymak istiyorsunuz : ");
            itemMap.get(is).setShelfNo(scan.next());
        } else {
            System.out.println("!!! Girdiğiniz id sistemimizde bulunmamaktadır !!!");
        }

    }

    public static void sellItem(){

        System.out.print("Ürünün id sini giriniz : ");
        int is = TryCach.intGirisi();
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
