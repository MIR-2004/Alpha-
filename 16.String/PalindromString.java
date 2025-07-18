import java.util.Scanner;

public class PalindromString{

    public static boolean CheckPalindrom(String word){

        for (int i = 0; i < word.length()/2; i++) {
           if(word.charAt(i) != word.charAt(word.length()-i-1)){
             return false;
           }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        boolean result = CheckPalindrom(word);

        System.out.println(result);

        sc.close();
    }
}