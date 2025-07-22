public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = {2000, 500, 100, 50, 20, 10, 5, 2, 1};

        int target = 121;

        int currentval = target;
        int count = 0;

        int i = 0;
        while(currentval != 0){
          if(currentval >= coins[i]){
            count++;
            currentval -= coins[i];
          }else{
            i++;
          }
        }

        System.out.println(count);


    }
}
