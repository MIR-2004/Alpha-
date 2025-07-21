import java.util.Stack;

public  class QueueUsingStack{

    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();        
        static Stack<Integer> s2 = new Stack<>();  
        
        static void isEmpty(){
            if(s1.isEmpty()){
                System.out.println("The stack is empty.");
                return;
            }
        }

        static void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        static int remove(){
            if(s1.isEmpty()){
                System.out.println("The array is already empty.");
                return -1;
            }

            return s1.pop();
        }

        static int peek(){
            if(s1.isEmpty()){
                System.out.println("The array is already empty.");
                return -1;
            }

            return s1.peek();
        }
    }


    public static void main(String[] args) {
        
    }
}