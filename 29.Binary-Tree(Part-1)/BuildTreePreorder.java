import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreorder {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }        
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node buildNode(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildNode(nodes);
            newNode.right = buildNode(nodes);

            return newNode;
            
        }


        public static void preorder(Node root){

            if(root == null){
                return;
            }
            System.out.println(root.data+" ");

            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){

            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);

        }

        public static void postorder(Node root){

            if(root == null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }

        public static void levelorder(Node root){

            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node current = q.remove();
      
                if(current == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(current.data+" ");
                    if(current.left != null){
                        q.add(current.left);
                    }
                    if (current.right != null) {
                        q.add(current.right);
                    }
                }
            }
            
            
        }
    }
    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree bt = new  BinaryTree();

        Node root = bt.buildNode(nodes);

        BinaryTree.levelorder(root);

    }
}
