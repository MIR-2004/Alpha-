import java.util.Scanner;

public class BinomialCoefficient {

    //find factorial
    public static int FindFactorial(int num){
        int factorial = 1;
        for(int i = 1; i<=num; i++){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static int FindCoefficient(int n, int r){
        int Nfactorial = FindFactorial(n);

        int Rfactorial = FindFactorial(r);

        int NRfactorial = FindFactorial(n-r);

        int value = Nfactorial /(Rfactorial*NRfactorial);

        return value;
    }



    public static void main( String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int coefficient = FindCoefficient(n, r);

        System.out.println("The binomial coefficient is:"+coefficient);

    }
}
