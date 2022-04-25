package WareHouse_Project;

import java.util.Scanner;

public class TryCach {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int intControl() {
        int giris = 0;
        boolean flag = true;
        boolean flag2 = false;
        do {
            giris = 0;
            try {
                if (flag2 == true) {        // Dummy1 çalışmadan exception verdigi için sürekli satır atlıyordu. bu yüzden ilk seferde çalışmayan sonrasında çalışan bir dummy yaptım.
                    scan.nextLine();     //dummy 2
                }
                flag2 = true;
                giris = scan.nextInt();
                scan.nextLine();        //Dummy1

                flag = false;
                flag2 = false;
            } catch (Exception e) {
                System.out.println("! please make a valid entry");
            }

        } while (flag);

        return giris;
    }

    public static String stringControl() {
        String giris = "";
        boolean flag = true;

        do {
            giris = "";
            try {
                giris = scan.next();
                scan.nextLine();        //Dummy1
                flag = false;
            } catch (Exception e) {
                System.out.println("! please make a valid entry");
            }
        } while (flag);
        return giris;

    }
}
