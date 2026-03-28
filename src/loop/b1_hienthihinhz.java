package loop;

import java.util.Scanner;

public class b1_hienthihinhz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;

        do{
            System.out.println("1. Hình chữ nhật: ");
            System.out.println("2. Tam giác vuông: ");
            System.out.println("3. Tam giác cân: ");
            System.out.println("4. Thoát ");

            System.out.print("chọn: ");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    // hinhvuong
                    for(int i=1;i<=3;i++){
                        for(int j=1;j<=7;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                    case 2:
                        // vuongcan
                        System.out.println("1. Dưới trái");
                        System.out.println("2. Trên trái");
                        int type=scanner.nextInt();
                        int n=5;
                        switch(type){
                            case 1:
                                // dưới trái
                                for (int i = 1; i <= n; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;

                            case 2:
                                // trên trái
                                for (int i = n; i >= 1; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                        }
                        break;
                        case 3:
                            // tamgiaccan
                            int h=5;
                            for(int i=1;i<=h;i++){
                                for(int j=1;j<=h;j++){
                                    System.out.print(" ");
                                }
                                for(int j=1;j<=2*i;j++){
                                    System.out.print("*");
                                }
                            }
                                break;
                                case 4:
                                    System.out.println("Thoát");
                                    break;
                                default:
                                    System.out.println("sai lựa chọn");


            }
        }while (choice !=4);
    }
}
