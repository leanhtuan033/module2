package loop;

public class b3_sntnhohon100 {
    public static void main(String[] args) {
        for (int num=2; num<100; num++) {
            if (isPrime(num)){
                System.out.print(num+" ");
            }
        }
    }
    public static boolean isPrime(int n ) {
        if (n<2)  return false;

        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
