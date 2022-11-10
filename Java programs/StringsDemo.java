import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsDemo {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "a3", "a4", "b1", "b2", "c1", "c3", "c2");
        System.out.println(" Filter elements :");
        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
        System.out.println("Remove elements :");
        List<String> students = Arrays.asList("Raj", "John", "Hector");
        List<String> result = students.stream().filter(n -> !"Raj".equals(n)).collect(Collectors.toList());
        result.forEach(System.out::println);

    }

}
