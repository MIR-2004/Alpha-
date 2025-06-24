public class GetIthBit {
    public static void main (String args[]){
        int num = 10;
        int i = 3;

        int bitMask = 1<<i;

        int value = num & bitMask;

        if(value == 0){
            System.out.println("tha value in "+i+"th bit is 0");
        }else{
            System.out.println("tha value in "+i+"th bit is 1");
        }
    }
}
