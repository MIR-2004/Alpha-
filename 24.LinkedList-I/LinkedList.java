public class LinkedList{
    
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

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


    public Node findMid(Node head){
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
    public static void main(String[] args){

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(8);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println(ll.findPalindrom());
    }
}