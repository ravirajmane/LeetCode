import java.util.Arrays;

public class IntegerArray {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3 };
        // Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x *
        // x).average().ifPresent(System.out::println);
        Arrays.stream(arr).map(x -> x * x).average().ifPresent(System.out::println);
    }
}
