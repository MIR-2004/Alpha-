public class FibonacciSeries {

    public static int findFibbonacci(int num){
        if(num == 0 || num == 1){
           return num;
        }

        int fnm1 = findFibbonacci(num-1);
        int fnm2 = findFibbonacci(num-2);

        return fnm1+fnm2;

    }
    public static void main(String[] args) {
        int num = 26;

        System.out.println(findFibbonacci(num));
    }
}
