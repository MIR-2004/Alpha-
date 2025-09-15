public class array {
    private static void backtrack(int[] nums, int idx, int val){
       if(idx == nums.length){
        return;
       }

        nums[idx] = val;
        backtrack(nums, idx+1, val+1);
        nums[idx] = nums[idx]-2;
    }
    public static void main (String args[]){
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        backtrack(arr, 0, 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
