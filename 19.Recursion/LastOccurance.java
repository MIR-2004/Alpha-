public class LastOccurance {

    public static int returnNum(int[] arr, int i, int n){
        if(i == arr.length){
            return -1;
        }
        int isFound = returnNum(arr, i+1, n);
        if(isFound == -1 && arr[i] == n){
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,5,9};

        System.out.println(returnNum(arr,0, 5));
    }
}
