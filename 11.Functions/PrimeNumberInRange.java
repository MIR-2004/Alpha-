import java.util.Scanner;


public class PrimeNumberInRange {

    public static boolean CheckPrimeNumber(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void FindPrimeNumber(int num){
       for (int i = 2; i <= num; i++) {
           if (CheckPrimeNumber(i) == true) {
            System.out.println(i);
           }
       }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        FindPrimeNumber(num);
    }
}
