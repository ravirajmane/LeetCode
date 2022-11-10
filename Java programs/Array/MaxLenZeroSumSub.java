import java.util.HashMap;

class MaxLenZeroSumSub {

    static int maxLen(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0; // Initialize sum of elements
        int max_len = 0; // Initialize result
        int i = -1;
        map.put(sum, i);
        for (i = 0; i < arr.length; i++) {

            sum += arr[i];
            // if (sum == 0) {
            // max_len = i + 1;
            // }
            if (map.containsKey(sum) == false) {
                map.put(sum, i);
            } else {
                int j = map.get(sum);
                max_len = Math.max(max_len, i - j);
            }
        }
        return max_len;

    }

    public static void main(String arg[]) {
        int arr[] = { 0, -2, 2, 0, -8, 1, 7, 10, 23 };

        // Function call
        System.out.println(
                "Length of the longest 0 sum subarray is "
                        + maxLen(arr));
    }
}