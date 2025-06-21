package Programs;

import java.util.Arrays;

public class AssendingNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 7, 18, 3, 1, 12, 36};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}


