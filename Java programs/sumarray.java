import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class sumarray {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
