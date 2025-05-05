public class LargestNumber{

    public static int FindTheLargest(int price[]){
        int largeValue = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] >= largeValue) {
                largeValue = price[i];
            }
        }

        return  largeValue;
    }
    public static void main(String[] arg){

        int price[] = {4,1,6,999,36,78,34,789,24,56,231};

        System.out.println(FindTheLargest(price));

    }
}