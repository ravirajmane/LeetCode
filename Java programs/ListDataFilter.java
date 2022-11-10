
import java.util.Arrays;
import java.util.List;

public class ListDataFilter {

    public static void main(String args[]) {
        List<String> data = Arrays.asList("java", "not", "in", "use");

        data.stream().filter(word -> !"java".equals(word)).forEach(p -> System.out.println(p));

    }
}