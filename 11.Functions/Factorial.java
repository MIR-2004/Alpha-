import java.util.Scanner;

public class Factorial {

    public static int FindFactorial(int num){

        int factorial = 1;

        for(int i = 1; i<=num; i++){
            factorial = factorial*i;
        }

        return factorial;
    }
    public static void main( String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factorial = FindFactorial(num);

        System.out.println(factorial);

    }

}