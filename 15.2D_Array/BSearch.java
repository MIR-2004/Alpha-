public class BSearch {
    
    
    public static boolean Search(int arr [][], int key){

        int row = 0, col = arr[0].length-1;

        while (row <= arr.length-1 && col >=0) {
            if (arr[row][col] == key) {
                System.out.print("("+row + ","+ col +") ");
                return true;
            }else if(arr[row][col] > key){
                col--;
            }else{
                row++;
            }
        }

        return false;
    } 
    public static void main(String[] args){
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;

        Search(arr, key);
    } 
}
