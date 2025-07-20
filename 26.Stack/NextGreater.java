import java.util.Stack;

class NextGreater{

    public static void findGreater(int[] arr, int[] ng){
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while(!s.isEmpty() && arr[i] > arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ng[i] = -1;
            }else{
                ng[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        int[] arr = {6, 8, 0, 1, 3};
        int[] ng = new int[arr.length]; 

        findGreater(arr, ng);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(ng[i] +" ");
        }

    }
}