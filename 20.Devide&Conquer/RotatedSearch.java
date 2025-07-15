public class RotatedSearch {

    public static int binarysearch(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            int mid = i + (j-i)/2;
            if(arr[mid] == target){
               return mid;
            }

            if(arr[i] <= arr[mid]){
                if(target >= arr[i] && target < arr[mid]){
                    j = mid-1;
                }else{
                    i = mid+1;
                }
            }else{
                if(target > arr[mid] && target <= arr[j]){
                    i = mid+1;
                }else{
                    j = mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,1,2,3};
        System.out.println(binarysearch(arr, 2));
    }
}
