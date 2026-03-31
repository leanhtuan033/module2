package array;

import java.util.Scanner;

public class b4_timsolonnhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập số dòng:");
        int row=sc.nextInt();
        System.out.print("nhập số cột: ");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];

        System.out.println("nhập mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr[" + i + "][" + j + "]= ");
                arr[i][j]=sc.nextInt();
            }
        }
        int max=arr[0][0];
        int maxRow=0;
        int maxCol=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]>max) {
                    max=arr[i][j];
                    maxRow=i;
                    maxCol=j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là:"+ max );
    }
}
