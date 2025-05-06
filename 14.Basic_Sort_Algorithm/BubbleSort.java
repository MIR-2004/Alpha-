public class BubbleSort{

    public static void Sort(int arr[]){

        int temp = 0;
        for (int j = 0; j < arr.length-2; j++) {
            for (int i = 0; i < arr.length-j-1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
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

