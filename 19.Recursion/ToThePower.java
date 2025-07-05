public class ToThePower{

    public static int findPower(int n, int p){
        if(p == 1){
            return n;
        }

        return n * findPower(n, p-1);
        
    }
    public static void main(String[] args) {
        System.out.println(findPower(2, 3));
    }
}