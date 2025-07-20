import java.util.Stack;

public class PushAtBottom {

    public static void pushData(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushData(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(8);
        s.push(3);
        s.push(5);

        pushData(s, 7);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
