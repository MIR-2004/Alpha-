public class TrappedRainWater {

    public static int FindTrappedWater(int height[]){

        int n = height.length;

        //left max value
        int LeftMax[] = new int[n];

        LeftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }

        // right max value
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];

        for (int i = n-2; i >= 1; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
         
        int TrappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(LeftMax[i], RightMax[i]);

            TrappedRainWater +=  waterlevel - height[i];
        }

        return TrappedRainWater; 
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(FindTrappedWater(height));
    }
}
