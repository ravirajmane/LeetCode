import java.util.*;

public class LambdaWithArrayListTest {
    public static void main(String args[]) {
        // ArrayList<String> studentList = new ArrayList<String>();
        // studentList.add("Raja");
        // studentList.add("Adithya");
        // studentList.add("Jai");

        List<String> colors = Arrays.asList("red", "yellow", "green");
        // colors.forEach(System.out::println);
        colors.forEach(color -> System.out.println(color));

    }
}
