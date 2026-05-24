import java.util.*;

class ClimbingStairs {

    private static int countWays(int n, int[] ways){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWays(n-1, ways) + countWays(n-2, ways) + countWays(n-3, ways) + countWays(n-4, ways);
        return ways[n];
    }
    public static void main(String[] args){
        int num = 4;

        int ways[] = new int[num+1];
        
        Arrays.fill(ways, -1);

        System.out.println(countWays(num, ways));
    }
}