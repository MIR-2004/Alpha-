public class ClearIthBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;

        int BitMask = ~(0)<<i;

        System.out.println(n & BitMask);
        
    }
}
