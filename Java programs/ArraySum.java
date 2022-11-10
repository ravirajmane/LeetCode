import java.util.Arrays;
import java.util.List;

public class ArraySum {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3);
        Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        // In the same way, we can use an already existing Java method:

        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum1 = integers1.stream().reduce(0, Integer::sum);
        System.out.println(sum1);
    }
}
