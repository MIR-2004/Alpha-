import java.util.ArrayList;

public class PairSum1 {

    public static void findPair(ArrayList<Integer> num, int target) {

        int left = 0;
        int right = num.size() - 1;

        while (left < right) {

            if (num.get(right) + num.get(left) == target) {
                break;
            }

            if (num.get(right) > target || num.get(left) + num.get(right) > target) {
                right--;
            } else if (num.get(left) + num.get(right) < target) {
                left++;
            }
        }

        System.out.println(num.get(left));
        System.out.println(num.get(right));

    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        int target = 6;

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        findPair(num, target);

    }
}
