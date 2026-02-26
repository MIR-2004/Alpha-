public class Knapsack_Tabulation{
    private static int check(int[] val, int weight[], int W){
            int[][] dp = new int[val.length+1][W+1];

            for(int i = 0; i < dp.length; i++){
                dp[i][0] = 0;
            }

            for(int i = 0; i < dp[0].length; i++){
                dp[0][i] = 0;
            }

            for (int i = 1; i <= val.length; i++) {
                for (int j = 1; j <= W; j++) {
                    int v = val[i-1];
                    int w = weight[i-1];

                    if(w <= j){
                        int incProfit = v + dp[i-1][j-w];
                        int excProfit = dp[i-1][j];
                        dp[i][j] = Math.max(incProfit, excProfit);
                    }else{
                        int excProfit = dp[i-1][j];
                        dp[i][j] = excProfit;
                    }
                }
            }

        return dp[val.length][W];

    }
    public static void main(String args[]){
        int val[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int w = 7;

        int maxVal = check(val, weight, w);

        System.out.println(maxVal);
    }
}