public class Stock {

    public static int FindMaxProfit(int prices[]){
        int MaxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i]- buyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            } else {
               buyPrice = prices[i]; 
            }
        }

        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        int num = FindMaxProfit(prices);
        System.out.println(num);
    }
}
