package WareHouse_Project;

import java.util.Scanner;

import static WareHouse_Project.Products.itemMap;


public class WareHouse_Methods {

    static int id = 1005;
    static Scanner scan = new Scanner(System.in);


    public static void defineItem(){
        System.out.println("Ürün ismini giriniz : ");
        String itemName = scan.next();

        System.out.println("Üretici Firma ismini giriniz : ");
        String manifacturer = scan.next();

        System.out.println("Birimi giriniz : ");
        String unit = scan.next();

        Products item = new Products(itemName, manifacturer, 0, unit, "null" );
        itemMap.put(id, item);
        id++;
    }
    public static void listItems(){

        System.out.println("");
        System.out.printf( "\t%-5s %-8s %-12s %-12s %-10s %-7s\n" , "id", "ismi", "ureticisi"
                , "miktarı", "birimi", "raf");
        System.out.println("================================================================");


    }


}
