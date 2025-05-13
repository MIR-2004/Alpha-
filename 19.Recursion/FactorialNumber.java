public class FactorialNumber {

    public static int findFactorial(int num){
        if(num == 1){
            return num;
        }
        int fn = num * findFactorial(num-1);

        return fn;
    }
    public static void main(String[] args) {
        int num = 5;


        System.out.println(findFactorial(num));
    }
}
