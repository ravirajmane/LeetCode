import java.util.*;
import java.util.stream.*;

public class StringArraytoStreamConvert {
    public static void main(String[] args) {
        String[] arr = { "Dell", "HP", "Apple" };
        int[] a = { 2, 3, 4, 1 };
        IntStream sarr = Arrays.stream(a);
        sarr.forEach(s -> System.out.println(s + ""));
        // Arrays.stream to convert array into stream
        Stream<String> st = Arrays.stream(arr);
        st.forEach(s -> System.out.println(s + ""));
    }
}
