import java.util.Arrays;
import java.util.List;

//https://www.youtube.com/watch?v=vHwToYEYvsU&list=PLTyWtrsGknYdqY_7lwcbJ1z4bvc5yEEZl
public class stringArrayLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj", "Sam", "Ravi");

        // for (String n : names) {
        // if (!n.equals("Ravi")) {
        // System.out.println(n);
        // }
        // }

        // names.stream().filter(new Predicate<String>() {
        // @Override
        // public boolean test(String n) {
        // return !n.equals("Ravi");
        // }

        // }).forEach(n -> System.out.println(n));

        // predicate can be replaced with lambda as follows

        // forEach takes consumer

        // names.stream().filter(n -> !n.equals("Ravi")).forEach(new Consumer<String>()
        // {
        // @Override
        // public void accept(String n) {
        // System.out.println(n);
        // }

        // });
        names.stream().filter(n -> !n.equals("Ravi")).forEach(n -> System.out.println(n));

        // method reference
        // names.stream().filter(n -> !n.equals("Ravi")).forEach(System.out::println);

        // Functional style
        names.stream().filter(stringArrayLambda::isNotRavi).forEach(System.out::println);
        names.stream().filter(n -> isNotRavi(n)).forEach(System.out::println);
    }

    static boolean isNotRavi(String n) {
        return !n.equals("Ravi");
    }
}
