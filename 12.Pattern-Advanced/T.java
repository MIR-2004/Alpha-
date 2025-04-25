import java.util.Scanner;

public class T {
   public static void Create01Triangle(int h){
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
               if ((i+j)%2 == 0) {
                System.out.print("1");
               } else {
                System.out.print("0");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int h = sc.nextInt();

        Create01Triangle(h);

    }
}
