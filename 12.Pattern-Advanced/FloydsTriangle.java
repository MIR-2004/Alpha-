import java.util.Scanner;

public class FloydsTriangle {

    public static void CreateFloydsTriangle(int h){
        int num = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(num + " ");
               num++; 
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int h = sc.nextInt();

        CreateFloydsTriangle(h);

    }
}
