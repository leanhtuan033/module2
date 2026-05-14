package QuanLy_Coffee.View;

import QuanLy_Coffee.Controller.DrinkController;
import QuanLy_Coffee.Entity.Drink;
import QuanLy_Coffee.Utils.CheckInput;

import java.util.List;
import java.util.Scanner;

public class DrinkView {
    private static DrinkController controller = new DrinkController();

    public static void mainMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("===== QUẢN LÝ QUÁN CÀ PHÊ =====");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm món");
            System.out.println("3. Sửa món");
            System.out.println("4. Xóa món");
            System.out.println("5. Tìm kiếm món");
            System.out.println("6. Tính tiền hóa đơn");
            System.out.println("7. Thoát");

            int choice = CheckInput.checkInt("Nhập lựa chọn: ");

            switch (choice) {

                case 1:

                    List<Drink> drinks = controller.getAll();

                    System.out.println("+-----+----------------------+------------+");
                    System.out.printf("| %-3s | %-20s | %-10s |\n",
                            "ID", "Tên món", "Giá");
                    System.out.println("+-----+----------------------+------------+");

                    for (Drink drink : drinks) {
                        System.out.println(drink);
                    }

                    System.out.println("+-----+----------------------+------------+");

                    break;

                case 2:

                    Drink drink = inputInformation();

                    controller.add(drink);

                    System.out.println("Thêm thành công");

                    break;

                case 3:

                    int editId = CheckInput.checkInt("Nhập ID cần sửa: ");

                    controller.edit(editId);

                    break;

                case 4:

                    int deleteId = CheckInput.checkInt("Nhập ID cần xóa: ");

                    controller.delete(deleteId);

                    break;

                case 5:

                    System.out.print("Nhập tên món cần tìm: ");
                    String name = scanner.nextLine();

                    controller.search(name);

                    break;

                case 6:

                    controller.calculateBill();

                    break;

                case 7:

                    return;
            }
        }
    }

    public static Drink inputInformation() {

        Scanner scanner = new Scanner(System.in);

        int id = CheckInput.checkInt("Nhập ID: ");

        System.out.print("Nhập tên món: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        return new Drink(id, name, price);
    }
}
