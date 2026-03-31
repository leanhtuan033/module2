package method;

import java.util.Scanner;

public class b1_tongsotrongcot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số dòng: ");
        int rows = sc.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        double[][] arr = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextDouble();
            }
        }

        System.out.print("Nhập cột cần tính: ");
        int col = sc.nextInt();

        if (col < 0 || col >= cols) {
            System.out.println("Cột không hợp lệ!");
            return;
        }

        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += arr[i][col];
        }

        System.out.println("Tổng các phần tử của cột " + col + " là: " + sum);
    }
}
