public class SetIthBit {
    public static void main(String[] args) {
        int num = 10;
        int i = 3;

        int bitMask = 1<<i;

        int value = num | bitMask;

        System.out.println(value);
    }
}
