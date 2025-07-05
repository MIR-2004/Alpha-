import java.util.ArrayList;

public class PrintReverse {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for (int i = num.size()-1; i >= 0; i--) {
            System.out.print(num.get(i)+ " ");
        }
    }
}
