import java.util.*;

class KthLevel{

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildNode(int[] nodes) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildNode(nodes);
            newNode.right = buildNode(nodes);

            return newNode;

        }

         public static void preorder(Node root) {

            if (root == null) {
                return;
            }
            System.out.println(root.data + " ");

            preorder(root.left);
            preorder(root.right);
        }



        static void kthLevel(Node root,int level, int k){
            if(root == null){
                return;
            }

            if(level == k){
                System.out.print(root.data+" ");
                return;
            }

            kthLevel(root.left, level+1, k);
            kthLevel(root.right, level+1, k);
    
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path){

            if(root == null){
                return false;
            }
            
            if(root.data == n){
                return true;
            }

            path.add(root);

            boolean findLeft = getPath(root.left, n, path);
            boolean findRight = getPath(root.right, n, path);

            if(findLeft || findRight){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            
            int i = 0;
            for (; i < path1.size() && i<path2.size(); i++) {
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }

            return path1.get(i-1);

        }

        public static Node lca2(Node root, int n1, int n2){
            if(root == null || root.data == n1 || root.data == n2){
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            if(leftLca == null){
                return rightLca;
            }

            if(rightLca == null){
                return leftLca;
            }

            return root;
        }

        public static int lcaDist(Node root, int n){
            if(root == null){
                return -1;
            }

            if(root.data == n){
                return 0;
            }

            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right, n);

            if(leftDist == -1 && rightDist == -1){
                return -1;
            }else if(leftDist == -1){
                return rightDist+1;
            }else{
                return leftDist+1;
            }
    
            
        }

        public static int minDistance(Node root, int n1, int n2){
            Node lca = lca(root, n1, n2);

            int leftdis = lcaDist(lca, n1);
            int rightdis = lcaDist(lca, n2);

            return leftdis+rightdis;
        }

        public static int kAncestor(Node root, int n, int k){
            if(root == null){
                return -1;
            }

            if(root.data == n){
                return 0;
            }

            int leftDist = kAncestor(root.left, n, k);
            int rightDist = kAncestor(root.right, n, k);

            if(leftDist == -1 && rightDist == -1){
                return -1;
            }

            int max = Math.max(leftDist, rightDist);

            return max+1;
        }

        public static int sumTree(Node root){
            if(root == null){
                return 0;
            }

            int leftsum = sumTree(root.left);
            int rightsum = sumTree(root.right);

            int newleft = root.left == null ? 0: root.left.data; 
            int newright = root.right == null ? 0: root.right.data; 


            int data = root.data;
            root.data = newleft + leftsum + newright + rightsum;
            return data;
        }

    }
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);


            Node subRoot = new Node(2);
            subRoot.left = new Node(3);
            subRoot.right = new Node(5);

            BinaryTree.sumTree(root);

            BinaryTree.preorder(root);


            
    }

}
 
