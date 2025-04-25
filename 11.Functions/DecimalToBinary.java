import java.util.Scanner;

public class DecimalToBinary {
    public static int FromDecimalToBinary(int num){

        int Number = num;
        int Remainder;
        int BinaryValue = 0;
        int i = 1;

        while (Number != 0) { 
            Remainder = Number%2; 
            BinaryValue += (Remainder * (int)Math.pow(10, i));
            Number = Number/2;
            i++;
        }

        return  BinaryValue;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal number: ");
        int num = sc.nextInt();

        System.out.println(FromDecimalToBinary(num));
    }
}
