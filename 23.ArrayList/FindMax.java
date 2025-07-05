import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        int max = 0;

        for (int i = 0; i < num.size(); i++) {
            if(num.get(i) > max){
                max = num.get(i);
            }
        }

        System.out.println(max);
    }
}
