public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            if(head == null && tail ==null){
                return true;
            }
            return false;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head= tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){

            if(isEmpty()){
                return -1;
            }


            int result = head.data;

            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }

            return result;
        }

        public static int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }

        
    }
    public static void main(String[] args){
        Queue q = new Queue();

        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
}
