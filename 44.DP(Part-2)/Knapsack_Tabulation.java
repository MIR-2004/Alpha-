public class Knapsack_Tabulation{
    private static int maxVal;

    private static void check(int[] val, int weight[], int w){
        if(w <= 0){
            return;
        }

        

    }
    public static void main(String args[]){
        int val[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int w = 7;

        check(val, weight, w);

        System.out.println(maxVal);
    }
}