public class FibbonacciSeries {
    private static int fibonacci(int n, int[] f){
        if(n == 0 || n == 1){
            return n;
        }

        if(f[n] != 0){
            return f[n];
        }

        return fibonacci(n-1, f) + fibonacci(n-2, f);
    }

    private static int fibtabulation(int n, int[] f){
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < f.length; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[f.length-1];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] f = new int[n+1];

        System.out.println(fibtabulation(n, f));
    }
}
