public class Knapsack_Memoization{

    private static int check(int[] val, int weight[], int w, int idx, int[][] dp){
        if(w == 0 || idx == 0){
            return 0;
        }

        if(dp[idx][w] != -1){
            return dp[idx][w];
        } 

        if(weight[idx-1] <= w){
            int ans1 = val[idx-1] + check(val, weight, w - weight[idx-1], idx-1, dp);
            int ans2 = check(val, weight, w, idx-1, dp);
            dp[idx][w] = Math.max(ans1, ans2);
            return dp[idx][w];
        }else{
            dp[idx][w] = check(val, weight, w, idx-1, dp);
            return dp[idx][w];
        }
    }
    public static void main(String args[]){
        int val[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int w = 7;

        int dp[][] = new int[val.length+1][w+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        int maxVal = check(val, weight, w, val.length, dp);

        System.out.println(maxVal);

    }
}