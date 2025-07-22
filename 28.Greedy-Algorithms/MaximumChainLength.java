import java.util.Arrays;
import java.util.Comparator;

public class MaximumChainLength {
    public static void main(String[] args) {
        int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(key -> key[1]));

        int count = 1;
        int lastchain = pairs[0][1];

        for(int i = 1; i < pairs.length; i++) {
            if(lastchain < pairs[i][0]){
                count++;
                lastchain = pairs[i][1];
            }
        }

        System.out.println(count);


    }
}
