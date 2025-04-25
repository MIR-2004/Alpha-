import java.util.Scanner;

public class InvertedHalfPyramid {

    public static void CreateInvertedHalfPyramid(int h){
        for(int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hight of the pyramid: ");
        int h = sc.nextInt();

        CreateInvertedHalfPyramid(h);
    }
}
