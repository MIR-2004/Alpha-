public class SelectionSort {
    public static void Sort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int MinValueIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[MinValueIndex] > arr[j]) {
                    MinValueIndex = j;
                }
            }
            int temp = arr[MinValueIndex];
            arr[MinValueIndex] = arr[i];
            arr[i] = temp;
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
