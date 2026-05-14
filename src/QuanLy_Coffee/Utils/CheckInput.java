package QuanLy_Coffee.Utils;

import java.util.Scanner;

public class CheckInput {
    public static int checkInt(String message) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.print(message);

                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Vui long nhap so!");
            }
        }
    }
}
