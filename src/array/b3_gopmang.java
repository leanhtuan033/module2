package array;

import java.util.Scanner;

public class b3_gopmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1=4;
        int n2=4;

        int[] arr1=new int[n1];
        int[] arr2=new int[n2];

        System.out.println("nhập mảng 1: ");
        for (int i = 0; i < n1; i++) {
            System.out.print("arr1[" + i + "]=");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhập mảng 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = sc.nextInt();
        }
        int[] arr3= new int[n1+n2];

        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[n1+i] = arr2[i];
        }

        System.out.println("mảng sau khi gộp: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
