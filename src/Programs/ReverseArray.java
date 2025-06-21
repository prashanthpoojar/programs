package Programs;
import java.util.Arrays;

public class ReverseArray {
    // Reverses the array in-place
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        System.out.println("Before reversing: " + Arrays.toString(data));
        reverse(data);
        System.out.println("After reversing:  " + Arrays.toString(data));
    }
}
