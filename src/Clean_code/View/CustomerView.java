package Clean_code.View;

import Clean_code.Model.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private Scanner scanner = new Scanner(System.in);

    public Customer inputCustomer() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String birthday = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        return new Customer(name, birthday, address);
    }

    public void display(List<Customer> list) {
        for (Customer c : list) {
            System.out.println(c);
        }
    }

    public String inputName() {
        System.out.print("Nhập tên: ");
        return scanner.nextLine();
    }

    public void menu() {
        System.out.println("1. Danh sách");
        System.out.println("2. Thêm");
        System.out.println("3. Xoá");
        System.out.println("4. Tìm kiếm");
        System.out.println("0. Thoát");
    }
}
