package WareHouse_Project;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    public static void menu(){
        System.out.println("");
        System.out.println("Please choise your operations.. ");
        System.out.println("");
        System.out.println("1- Add New Item \n2- List Items\n3- Ürün Girişi" +
                "\n4- Put Item to Shelf\n5- Exit Item\n6- Exit Program");
        int choise = scan.nextInt();
        if(choise<7 && choise > 0) {
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
                    WareHouse_Methods.puttingItemToShelf();
                    break;
                }
                case 5 -> {
                    WareHouse_Methods.exitItem();
                    break;
                }
                case 6 -> {
                    WareHouse_Methods.exit();
                    break;
                }

            }
            menu();
        } else {
            System.out.println("Giriş hatalı , lütfen yeniden deneyiniz ");

        }
    }
}
