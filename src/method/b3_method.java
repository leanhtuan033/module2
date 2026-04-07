package method;

import java.util.Scanner;

public class b3_method {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print(" nhập chuỗi: ");
        String string = scanner.nextLine();

        System.out.print("nhập ký tự cần đếm :");
        char ch = scanner.next().charAt(0);

        int count = 0;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện là:"+ count);

    }
}
