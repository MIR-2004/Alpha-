import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "({[]}[])()";

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    System.out.println("Parenthesis are not valid.");
                    return;
                }

                char top = s.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    s.pop();
                } else {
                    System.out.println("Parenthesis are not valid.");
                    return;
                }
            }
        }

        if (s.isEmpty()) {
            System.out.println("Parenthesis are valid.");
        } else {
            System.out.println("Parenthesis are not valid.");
        }
    }
}
