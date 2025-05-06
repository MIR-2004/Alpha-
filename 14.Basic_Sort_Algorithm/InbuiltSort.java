import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer arr[] = {32,45,84,23,76,34,65,98,54,12,65};

        //Arrays.sort(arr);

        //Arrays.sort(arr,0,4);

        Arrays.sort(arr, Collections.reverseOrder()); // always work on object type var thats why we use Integer data type instead of int

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +", ");
        }

    }
}

// time complexity = n(logn)
