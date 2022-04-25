package WareHouse_Project;

import java.util.Scanner;

import static WareHouse_Project.Products.itemMap;
import static WareHouse_Project.Products.keySet;


public class WareHouse_Methods {

    static int id = 1005;
    static Scanner scan = new Scanner(System.in);


    public static void defineItem() {
        System.out.print("Product Name : ");
        String itemName = TryCach.stringControl();

        System.out.print("Manufacturer Name : ");
        String manifacturer = TryCach.stringControl();

        System.out.print("Unit Type : ");
        String unit = TryCach.stringControl();

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
        System.out.print("ID Number : ");
        int is = TryCach.intControl();
        if(itemMap.containsKey(is)) {
            System.out.print("Amount : ");
            itemMap.get(is).setQuantity(itemMap.get(is).getQuantity() + scan.nextInt());
        } else {
            System.out.println("");
            System.out.println("!!! There is no ID !!!");
        }
    }

    public static void putItemToShelf(){
        // id ye göre objeyi getiren mthod yazalşım burada
        System.out.print("ID number : ");
        int is = TryCach.intControl();
        if(itemMap.containsKey(is)) {
            System.out.print("Shelf number pls  : ");
            itemMap.get(is).setShelfNo(scan.next());
        } else {
            System.out.println("!!! There is no ID  !!!");
        }

    }

    public static void sellItem(){

        System.out.print("ID Number : ");
        int is = TryCach.intControl();
        if(itemMap.containsKey(is)) {
            System.out.print("Product Out : ");
            itemMap.get(is).setQuantity(itemMap.get(is).getQuantity() - scan.nextInt());
        } else {
            System.out.println("!!! There is no ID !!!");
        }

    }

    public static void exit(){
        System.exit(0);
    }


}
