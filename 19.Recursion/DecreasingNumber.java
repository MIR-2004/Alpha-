public class DecreasingNumber{

    public static void printNums(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printNums(num-1);
    }
    
    public static void main(String[] args) {

        int num = 10;
        printNums(num);
        
    }
}
