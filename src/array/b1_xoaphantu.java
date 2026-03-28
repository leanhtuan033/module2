package array;

import java.util.Scanner;

public class b1_xoaphantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {10,4,6,7,8,6};
        int n = arr.length;

        System.out.print("Nhập số cần xoá :");
        int x = sc.nextInt();

        int index= -1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("không tìm thấy");
        }else {
            for(int i=index;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            n--;  //giảm kích thước

            System.out.println("Mảng sau khi xoá:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
