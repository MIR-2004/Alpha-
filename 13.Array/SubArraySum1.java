public class SubArraySum1 {
    public static int FindSubarrays(int arr[]){
        int MaxSum = 0;
        for(int i=0; i <= arr.length-1; i++){
            for (int j = i; j <= arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                if (MaxSum < sum) {
                    MaxSum = sum;
                }
            }
            
        }
        return MaxSum;
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 6 ,8,10};

        System.out.println(FindSubarrays(arr));
    }
}
