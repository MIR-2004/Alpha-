import java.util.Scanner;

public class HollowRectacngle{

    public static void CreateHollowRectangle(int h, int w){
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || j == 1 || i == h || j == w) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entar the hight of the rectangle: ");
        int h = sc.nextInt();
        System.out.print("Entar the width of the rectangle: ");
        int w = sc.nextInt();

        CreateHollowRectangle(h, w);
    }
}