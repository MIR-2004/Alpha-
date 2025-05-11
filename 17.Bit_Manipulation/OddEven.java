import java.util.Scanner;

public class OddEven{
    public static String CheckOddEven(int  num){

        int newNum = num & 1;

        if (newNum == 1) {
            return "Odd";
        }

        return "Even";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(CheckOddEven(sc.nextInt()));
    }
}