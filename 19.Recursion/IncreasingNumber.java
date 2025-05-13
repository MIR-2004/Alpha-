public class IncreasingNumber {

    public static void printNums(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        printNums(num-1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 5;
        printNums(num);
    }
}
