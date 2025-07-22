import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        
        int[][] matrix = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            matrix[i][0] = i;
            matrix[i][1] = start[i];
            matrix[i][2] = end[i];
        }

        Arrays.sort(matrix, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        int maxCount = 1;
        ans.add(0);
        int lasttime = end[0];

        for (int i = 1; i < end.length; i++) {
            if(start[i] <= lasttime){
                maxCount++;
                ans.add(i);
                lasttime = end[i];
            }
        }

        System.out.println(maxCount);
    }
}
