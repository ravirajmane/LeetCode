
import java.util.Arrays;
import java.util.Collections;

public class ReverseArraySort {
    public static void main(String[] args) {

        // Cannot perform following operation on this array.
        // int arr[]=new int[]{3,2,1,6};

        Integer[] arr = { 3, 6, -1, 205 };
        String[] strarr = { "Raj", "Amit", "John" };
        int[] normal_array = { 3, 2, 8, -1, 5, 6 };
        // sorts array[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(arr));

        Arrays.sort(strarr);
        System.out.println("Strings in ascending order: " + Arrays.toString(strarr));

        Arrays.sort(strarr, Collections.reverseOrder());
        System.out.println("Strings in descending order: " + Arrays.toString(strarr));

        // sort subarray based on index
        // fromIndex: The index of the first element of the subarray. It participates in
        // the sorting.
        // toIndex: The index of the last element of the subarray. It does not
        // participate in the sorting.
        Arrays.sort(normal_array, 1, 5);

        for (int i : normal_array) {
            System.out.println(i);
        }

    }
}