import java.io.IOException;
import java.util.Arrays;

import java.util.List;

public class NamesSorted {
    public static void main(String[] args) throws IOException {

        String[] names = { "Java", "net", "Python", "Pana" };
        // Arrays.stream - This method returns a Sequential Stream from the array passed
        // as the parameter.
        Arrays.stream(names).filter(e -> e.startsWith("P")).sorted().forEach(System.out::println);
    }
}
