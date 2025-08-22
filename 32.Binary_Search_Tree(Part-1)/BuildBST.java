
import java.util.ArrayList;



class BuildBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(int data, Node root) {
        if (root == null) {
            root = new Node(data);
            System.out.println("Inserted " + data + "in the BST.");
        }

        if (root.data > data) {
            root.left = insert(data, root.left);
        }

        if (root.data < data) {
            root.right = insert(data, root.right);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {

            // 0 leaf nodes
            if (root.left == null && root.right == null) {
                return null;
            }

            // one leaf node is null
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // no leaf node is null

            Node IS = inordersucceser(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }

    public static Node inordersucceser(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int num1, int num2){
        if(root == null){
            return;
        }
        if(root.data <= num2 && root.data >= num1){
            printInRange(root.left, num1, num2);
            System.out.print(root.data+" ");
            printInRange(root.right, num1, num2);
        }else if(root.data > num2){
            printInRange(root.left, num1, num2);
        }else{
            printInRange(root.right, num1, num2);
        }

    }

    public static void pathFinder(Node root, ArrayList<Number> nums){

        if(root == null){
            return;
        }

        nums.add(root.data);

        if(root.left == null && root.right == null){
            for(int i = 0; i < nums.size(); i++){
                System.out.print(nums.get(i) + " ");
            }
            System.out.println();
        }
        pathFinder(root.left, nums);
        pathFinder(root.right, nums);
        nums.removeLast();
    }

    public static boolean isValid(Node root, Node max, Node min){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }

        if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, max, min) && isValid(root.right, max, min);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    public static Node createBST(int[] arr, int start, int end){

        if(start > end){
            return null;
        }

        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node n = new Node(8);
        ArrayList<Number> nums = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            insert(arr[i], n);
        }

    }
}