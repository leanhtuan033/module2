package introduction_to_jv;

import java.util.Scanner;

public class b3_chuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập usd:");
        usd=scanner.nextDouble();
        double quydoi=usd*vnd;
        System.out.println("Giá trị quy đổi là:" + quydoi + "vnd");
    }
}
