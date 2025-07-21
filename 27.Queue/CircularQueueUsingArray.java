public class CircularQueueUsingArray {

    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front; 

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            if(rear == -1){
               return true;
            }
            return false;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.print("Queue is full.");
                return;
            }
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1)%size;
            arr[rear] = data;
            System.out.println("Item added successsfully.");
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("The stack is already empty.");
                return -1;
            }

            int result = arr[front];

            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("The stack is Empty.");
                return -1;
            }

            return arr[front];
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
