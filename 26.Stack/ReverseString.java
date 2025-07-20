import java.util.Stack;

public class ReverseString {

    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        int idx = 0;

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "INDIA";

        System.out.println(reverse(str));
    }
}
