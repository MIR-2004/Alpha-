import java.util.Scanner;

public class BinaryToDecimal {

    public static int FromBinaryToDecimal(int num){

        int Number = num;
        int Remainder;
        int DecimalValue = 0;
        int i = 0;

        while (Number != 0) { 
            Remainder = Number%10;
            DecimalValue += (Remainder * (int)Math.pow(2, i));
            Number = Number/10;
            i++;
        }

        return  DecimalValue;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number: ");
        int num = sc.nextInt();

        System.out.println(FromBinaryToDecimal(num));;
    }
}
