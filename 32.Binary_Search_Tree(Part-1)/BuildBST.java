class BuildBST{

    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
        }
    }


    public static Node insert(int data, Node root){
       if(root == null){
        root = new Node(data);
        System.out.println("Inserted "+data+"in the BST.");
       }

       if(root.data > data){
            root.left = insert(data, root.left);
       }

       if(root.data < data){
        root.right = insert(data, root.right);
       }

       return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(data < root.data){
            return search(root.left, data);
        }else{
            return search(root.right, data);
        }
    }
    public static void main(String[] args){
        int arr[] = {5,1,3,2,4,7};
        Node n = new Node(5);

        for (int i = 1; i < arr.length; i++) {
            insert(arr[i], n);
        }

        System.out.println(search(n, 15));
    }
}