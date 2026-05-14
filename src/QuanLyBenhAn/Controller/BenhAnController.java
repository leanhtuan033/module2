package QuanLyBenhAn.Controller;

import QuanLyBenhAn.Service.BenhAnService;
import QuanLyBenhAn.Service.IBenhAnService;

import java.util.Scanner;

public class BenhAnController {

    public void menu() {

        Scanner scanner = new Scanner(System.in);

        IBenhAnService benhAnService =
                new BenhAnService();

        while (true) {

            System.out.println("\n===== CHƯƠNG TRÌNH QUAN LY BENH AN =====");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them moi");
            System.out.println("3. Xoa");
            System.out.println("4. Thoat");

            System.out.print("Chon chuc nang: ");

            int choice =
                    Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    benhAnService.display();
                    break;

                case 2:
                    benhAnService.add();
                    break;

                case 3:
                    benhAnService.delete();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Nhap sai");
            }
        }
    }
}
