package array;

import java.util.Scanner;

public class b5_timsobenhat {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("nhập số phần tử mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhập số thứ" + i + ": ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nất là: " + min);
    }
}
