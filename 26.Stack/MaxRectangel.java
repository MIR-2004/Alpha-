
import java.util.Stack;

public class MaxRectangel {
    public static int findMax(int[] arr){
        int maxArea = 0;
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];
        
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){

            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for(int i = 0; i<arr.length; i++){

            while(!s.isEmpty() && arr[i]<= arr[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea); 
        }

        return maxArea;

    }
    public static void main(String[] args) {
        int[] arr = {2, 4};
        System.out.println(findMax(arr));
    }
}
