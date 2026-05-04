package Stack_Queue.ThapPhan_to_NhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanToNhiPhan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int number = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int n = number;


        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }


        StringBuilder binary = new StringBuilder();

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        System.out.println("Số nhị phân của " + number + " là: " + binary);
    }
}
