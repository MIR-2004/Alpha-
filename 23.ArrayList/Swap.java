import java.util.ArrayList;

public class Swap {
     public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        int idx1 = 2;
        int idx2 = 4;

        int temp = num.get(idx1);
        num.set(idx1, num.get(idx2));
        num.set(idx2, temp);

        for(int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i)+" ");
        }
    }
}
