import java.util.ArrayList;

public class ContainerWithMostWater{

    public static int maxWater(ArrayList<Integer> height){
        int maxVal = Integer.MIN_VALUE;
        int left = 0;
        int right= height.size()-1;

        while(left < right){
            int currentVal = Math.min(height.get(right) , height.get(left)) * (right-left);
            maxVal = Math.max(maxVal, currentVal);

            if(height.get(right) > height.get(left)){
                left++;
            }else{
                right--;
            }
        }

        return maxVal;
        
    }
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


        System.out.println(maxWater(height));


    }
}