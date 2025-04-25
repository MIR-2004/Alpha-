import java.util.Scanner;

public class SolidRombus{
    public static void CreateSolidRombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CreateSolidRombus(n);
    }
}