import java.util.*;

class SubtreeofAnotherTree{

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

        public static boolean isidentical(Node root, Node subtree){
            if(root == null && subtree == null){
                return true;
            }else if(root == null || subtree == null || root.data != subtree.data){
                return false;
            }

            if(!isidentical(root.left, subtree.left)){
                return false;
            }

            if(!isidentical(root.right, subtree.right)){
                return false;
            }

            return true;
        }

       
        public static boolean isSubtree(Node root, Node subtree){
            if(root == null){
                return false;
            }

            if(root.data == subtree.data){
                if(isidentical(root, subtree)){
                    return true;
                }
            }

            return isSubtree(root.left, subtree) || isSubtree(root.right, subtree);
        }

        public static class Info{
            Node node;
            int hd;

            public Info(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }


        public static void topView(Node root){
            Queue<Info> q = new LinkedList<>();

            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0;
            int max = 0;

            q.add(new Info(root, 0));
            q.add(null);

            while(!q.isEmpty()){
                Info current = q.remove();
                if(current == null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                        continue;
                    }
                }
                
                if(!map.containsKey(current.hd)){
                    map.put(current.hd, current.node);
                }

                if(current.node.left != null){
                    q.add(new Info(current.node.left, current.hd-1));
                    min = Math.min(min, current.hd-1);
                }

                if(current.node.right != null){
                    q.add(new Info(current.node.right, current.hd+1));
                    max = Math.max(max, current.hd+1);
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data);
            }
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


            BinaryTree.kthLevel(root, 1, 3);
    }

}
