public class QueueUsingArray {

    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            if(rear == -1){
               return true;
            }
            return false;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.print("Queue is full.");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
            System.out.println("Item added successsfully.");
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("The stack is already empty.");
                return -1;
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }

            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("The stack is Empty.");
                return -1;
            }

            return arr[0];
        }

        
    }
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(12);
        q.add(6);
        q.add(65);
        q.add(45);
        q.add(34);
        q.add(89);


    }
}
