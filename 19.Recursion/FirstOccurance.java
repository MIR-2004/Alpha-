public class FirstOccurance {
    public static int firstOccurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] arg){
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(firstOccurance(arr,5,0));
    }
}
