public class ReverseArray {

    public static void reverse(int nums[]){
        int temp;
        int min = 0;
        int max = nums.length - 1;
        while(min < max){
            temp = nums[min];
            nums[min] = nums[max];
            nums[max] =temp;
            min++;
            max--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};

        reverse(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" ");
        }
    }
}
