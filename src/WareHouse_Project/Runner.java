package WareHouse_Project;

import java.util.Scanner;

public class Runner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Products items = new Products();
        System.out.println("*************************************************");
        System.out.println("*              Welcome To WareHouse             *");
        System.out.println("*************************************************");

       Menu.menu();


    }
}
