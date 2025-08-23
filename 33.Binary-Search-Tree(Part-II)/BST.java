import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }     
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int start, int end){

        if(start > end){
            return null;
        }
        
        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2){

        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2, arr2);


        int i =0, j = 0;
        ArrayList<Integer> merge = new ArrayList<>();

        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                merge.add(arr1.get(i));
                i++;
            }else{
                merge.add(arr2.get(j));
                j++;
            }
        }

        while(i < arr1.size()){
             merge.add(arr1.get(i));
                i++;
        }

        while(j < arr2.size()){
             merge.add(arr2.get(j));
                j++;
        }

        return createBST(merge, 0, merge.size());
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean  isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }

    }

    public static int maxValue = 0;

    public static Info maxBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        Info leftInfo = maxBST(root.left);
        Info rightInfo = maxBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.max(root.data, Math.max(leftInfo.min, rightInfo.min));
        int max = Math.min(root.data, Math.min(leftInfo.max, rightInfo.max));

        if(leftInfo.min >= root.data || rightInfo.max <= root.data){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxValue = Math.max(maxValue, size);
            return new Info(true, size, min, max); 
        }

        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        
    }
}
