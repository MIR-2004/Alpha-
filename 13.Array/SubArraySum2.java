public class SubArraySum2 {
    public static int FindSubarrays(int arr[]){
        int MaxSum = 0;
        int PrefixArr[] = new int[arr.length];

        PrefixArr[0] = arr[0];
        for (int i = 1; i < PrefixArr.length; i++) {
            PrefixArr[i] = PrefixArr[i-1] + arr[i] ;
        }


        for(int i=0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                int sum = i ==0? PrefixArr[j] :  PrefixArr[j] - PrefixArr[i-1];
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
