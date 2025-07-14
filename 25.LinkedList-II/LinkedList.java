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



    public static boolean detectLoop(){
        Node slow = head;
        Node fast = head;

        if(head == null || head.next == null){
            return false;
        }

        while(fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }


    public static void removeLoop(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            
            if(slow == fast){
                break;
            }
        }
        slow = head;

        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
        
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        head = list.new Node(3);
        head.next = list.new Node(5);
        head.next.next = list.new Node(6);
        //head.next.next.next = head;

        System.out.println(detectLoop());
    }
}