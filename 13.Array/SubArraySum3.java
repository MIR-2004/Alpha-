public class SubArraySum3 {

    public static int FindMaxSubArraySum(int arr[]){
        int CurrentSum =0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            CurrentSum += arr[i];
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }

            MaxSum = Math.max(MaxSum, CurrentSum);
        }

        return MaxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        System.out.println(FindMaxSubArraySum(arr));    
    }
}
