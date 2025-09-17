public class AVLTree {

    static class Node{
        int data, height;
        Node left, right;

        Node(int data){
            this.data = data;
            this.height = 1;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    // public static Node insert(Node root, int data){
    //     if(root == null){
    //         return new Node(data);
    //     }

    //     if(data > root.data){
    //         root.right = insert(root.right, data);
    //     }
    //     else if(data < root.data ){
    //         root.left = insert(root.left, data);
    //     }else{
    //         return root;
    //     }

    //     root.height = root.left.height + root.right.height + 1;

    // }



    public static void main(String[] args){

    }
}
