public class DiagonalSum {

    public static int calculateDiagonalSum(int arr[][]){
        int n = arr.length-1;
        int PD = 0;
        int SD = 0;


        for (int i = 0; i <= n; i++) {
            PD += arr[i][i];
        }

        for(int i = 0;  i <= n; i++) {
           SD += arr[i][n-i];
        }


        return SD + PD;

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int num = calculateDiagonalSum(arr);

        System.out.println(num);
    }
}
