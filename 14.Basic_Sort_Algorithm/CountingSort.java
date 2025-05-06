public class CountingSort {
    public static void Sort(int arr[]){
        int MaxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            MaxVal = Math.max(arr[i], MaxVal);
        }

        int Indexarr[] = new int[MaxVal+1];

        for (int i = 0; i < arr.length; i++) {
            Indexarr[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < Indexarr.length; i++) {
            while(Indexarr[i] > 0){
                arr[j] = i;
                j++;
                Indexarr[i]--;
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
