public class SpiralMatrix {

    public static void SpiralOutput(int arr[][]){
        int StartRow = 0;
        int EndRow = arr.length-1;
        int StartCol = 0;
        int EndCol = arr.length-1;

        while(StartRow <= EndRow && StartCol <= EndCol){
            for (int i = StartCol; i <= EndCol; i++) {
                System.out.print(arr[StartRow][i]+ " ");
            }


            for (int i = StartRow+1; i <=EndRow ; i++) {
                System.out.print(arr[i][EndCol]+ " ");
            }

            for (int i = EndCol-1; i >= StartCol; i--) {
                System.out.print(arr[EndRow][i]+" ");
            }

            for (int i = EndRow-1; i >= StartRow+1; i--) {
                System.out.print(arr[i][StartCol]+ " ");
            }

            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
        
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};

        SpiralOutput(arr);
    }
}
