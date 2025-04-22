import java.util.Scanner;

public class FindProduct {

    public static int CalculateProduct(int num1, int num2){
        int product = (num1*num2);
        return product;
    }
    public static void main( String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = CalculateProduct(a, b);

        System.out.println(product);

    }
}
