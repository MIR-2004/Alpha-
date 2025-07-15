public class QuickSort {

    public static void sortArr(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        sortArr(arr, si, pIdx-1);
        sortArr(arr, pIdx+1, ei);
    }


    public static int partition(int[] arr, int si, int ei){
        int i = si-1;
        int pivot = arr[ei];

        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,6,1,9,3,7,5};

        sortArr(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
