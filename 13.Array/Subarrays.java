public class Subarrays {
        public static  void FindSubarrays(int arr[]){
            for(int i=0; i <= arr.length-1; i++){
                for (int j = i; j <= arr.length; j++) {
                    for (int k = i; k < j; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.print("   ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args){
            int arr[] = {2, 4, 6 ,8, 10};
    
            FindSubarrays(arr);
        }
    
    
}
