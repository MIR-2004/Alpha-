import java.util.Arrays;
import java.util.Comparator;

public class Knapsak {
    public static void main(String[] args){
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};

        double[][] ratio  = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(key -> key[1]));

        int w = 50;
        int capacity = w;
        int maxValue = 0;

        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                maxValue += val[idx];
                capacity -= weight[idx];
            }else{
                maxValue += capacity* ratio[i][1];
            }
        }

        System.out.println(maxValue);
    }
}
