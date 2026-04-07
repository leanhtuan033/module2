package method;

import java.util.Scanner;

public class b2_mang2chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("nhập n: ");
        int n=scanner.nextInt();
        int[][] a = new int [n][n];

        System.out.println("nhập ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a["+i+"]["+j+"]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i][i];
        }
        System.out.println("tổng đường chéo ="+sum);
    }
}
