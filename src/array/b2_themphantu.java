package array;

import java.util.Scanner;

public class b2_themphantu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = new int[10];
        int n = 5;

        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;

        System.out.print("Nhập số cần chèn: ");
        int x = sc.nextInt();

        System.out.print("Nhập vị trí chèn: ");
        int index = sc.nextInt();

        // kiểm tra hợp lệ
        if (index < 0 || index > n) {
            System.out.println("Vị trí không hợp lệ!");
        } else {
            // dịch sang phải
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            // chèn
            arr[index] = x;
            n++;

            // in mảng
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
