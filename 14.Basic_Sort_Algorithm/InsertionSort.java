public class InsertionSort {
    public static void Sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int CurrentVal = arr[i];
            int prev = i -1;
            while(prev >= 0  && arr[prev] > CurrentVal){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = CurrentVal;
        }
    }

    public static void main(String[] args){
        int arr[] = {32,45,84,23,76,34,65,98,54,12,65};
        
        Sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +", ");
        }
    }
}
