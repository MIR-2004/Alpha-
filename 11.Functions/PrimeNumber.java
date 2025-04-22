import java.util.Scanner;

public class PrimeNumber {

    public static boolean CheckPrimeNumber(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(CheckPrimeNumber(num));;
    }
}
