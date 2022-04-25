package WareHouse_Project;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    public static void menu(){
        System.out.println("");
        System.out.println("Please choise your operations.. ");
        System.out.println("");
        System.out.println("""
                1- Add New Item\s
                2- List Items
                3- Add Item
                4- Put Item to Shelf
                5- Exit Item
                6- Exit Program""");
        //int choise = scan.nextInt();
        int choise = TryCach.intControl();
       // if(choise<7 && choise > 0) {
            switch (choise) {
                case 1 -> {
                    WareHouse_Methods.defineItem();
                    break;
                }
                case 2 -> {
                    WareHouse_Methods.listItems();
                    break;
                }
                case 3 -> {
                    WareHouse_Methods.addItem();
                    break;
                }
                case 4 -> {
                    WareHouse_Methods.putItemToShelf();
                    break;
                }
                case 5 -> {
                    WareHouse_Methods.sellItem();
                    break;
                }
                case 6 -> {
                    WareHouse_Methods.exit();
                    break;
                }

            }

        menu();
    }
}
