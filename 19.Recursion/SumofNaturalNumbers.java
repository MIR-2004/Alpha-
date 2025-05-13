public class SumofNaturalNumbers {
    public static int sum(int num){
        if(num == 0){
            return 0; 
        }

        return num + sum(num - 1); 
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Sum of first " + num + " natural numbers is: " + sum(num));
    }
}
