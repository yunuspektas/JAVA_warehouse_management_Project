package WareHouse_Project;

import JavaProjects.P11_depoYonetimi.Mrc.item;

import java.util.Scanner;

import static WareHouse_Project.Products.itemMap;
import static WareHouse_Project.Products.keySet;


public class WareHouse_Methods {

    static int id = 1005;
    static Scanner scan = new Scanner(System.in);


    public static void defineItem() {
        System.out.println("Ürün ismini giriniz : ");
        String itemName = scan.next();

        System.out.println("Üretici Firma ismini giriniz : ");
        String manifacturer = scan.next();

        System.out.println("Birimi giriniz : ");
        String unit = scan.next();

        Products item = new Products(itemName, manifacturer, 0, unit, "null");
        itemMap.put(id, item);
        id++;
    }

    public static void listItems() {
        keySet.addAll(itemMap.keySet());

        System.out.println("");
        System.out.printf("\t%-8s %-10s %-12s %-12s %-10s %-7s\n", "id", "ismi", "ureticisi"
                , "miktarı", "birimi", "raf");
        System.out.println("================================================================");

        for (int i = 0; i <keySet.size() ; i++) {

            System.out.printf("\t%-8s %-10s %-12s %-12s %-10s %-7s\n", itemMap.keySet().toArray()[i],
                    itemMap.get(keySet.get(i)).getProductName(),
                    itemMap.get(keySet.get(i)).getManufacturer(),
                    itemMap.get(keySet.get(i)).getQuantity(),
                    itemMap.get(keySet.get(i)).getUnit(),
                    itemMap.get(keySet.get(i)).getShelfNo());

        }
//        for (int i = 0; i < itemMap.values().size(); i++) {
//            System.out.printf("\t%-8s %-10s %-12s %-12s %-10s %-7s\n", itemMap.keySet().toArray()[i],
//                    itemMap.get(i).getProductName(),
//                    itemMap.get(itemMap.keySet().toArray()[i]).getManufacturer(),
//                    itemMap.get(itemMap.keySet().toArray()[i]).getQuantity(),
//                    itemMap.get(itemMap.keySet().toArray()[i]).getUnit(),
//                    itemMap.get(itemMap.keySet().toArray()[i]).getShelfNo());
//        }


    }


}
