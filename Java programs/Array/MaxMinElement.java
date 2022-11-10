import java.util.Arrays;

class MaxMinElement {
    public static void main(String[] args) {
        int arr[] = { 3, 2, -1, 5, 6, 76, 0, -34 };
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // int n = arr.length;
        // for (Integer e : arr) {
        // max = Math.max(max, e);
        // min = Math.min(min, e);
        // }

        // int res[] = { max, min };
        // return res;

        // MaxMinElement m = new MaxMinElement();
        maxMinEle(arr);

    }

    public static void maxMinEle(int a[]) {
        int max = a[0];
        int min = a[0];
        // int n = a.length;
        for (Integer e : a) {
            max = Math.max(max, e);
            min = Math.min(min, e);
        }

        System.out.println("max :" + max);
        System.out.println("min :" + min);

        int res[] = { max, min };
        System.out.println(Arrays.toString(res));
        // System.out.println("res :" + res);
        // int res1 = Arrays.toString(res);

    }

}
