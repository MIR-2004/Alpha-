public class LinkedList{
    
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public Node head;
    public Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index, int data){
        Node newNode = new Node(data);
        
        Node temp = head;

            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }

        newNode.next = temp.next;

        temp.next = newNode;


    }

    public void print(Node head){

        if(head == null){
            System.out.print("The LinkedList is empty");
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }

        System.out.println();
    }


    public void rev(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

    }


    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public boolean findPalindrom(){
        if(head == null || head.next == null){
            return true;
        }

        //find middle node
        Node mid = findMid(head);

        //reverse from mid

        Node curr = tail = mid;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }


        return true;
    }



    public static Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }


        Node mid = findMid(head);

        
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    public static Node merge(Node left, Node right){
        Node mergedll = new LinkedList().new Node(-1);
        Node temp = mergedll;

        while(left != null && right != null){
            if(left.data > right.data){
                temp.next = right;
                right = right.next;
            }else{
                temp.next = left;
                left = left.next;
            }
            temp = temp.next;
        }

        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedll.next;
    }

    public static Node zigZag(Node head){

        // find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // reverse second half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;


        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
         
        return head;

    }
    public static void main(String[] args){

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.head = zigZag(ll.head);
        ll.print(ll.head);
    }
}