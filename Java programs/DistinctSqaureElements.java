import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSqaureElements {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2, 3, 4, 2, 3);
        List<Integer> newlist = li.stream().map(x -> x * x).distinct().collect(Collectors.toList());
        System.out.println(newlist);
    }
}
