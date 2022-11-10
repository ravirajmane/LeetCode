import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        // Counting Empty String
        long count = strList.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Count :" + count);

        // Count String whose length is more than three
        long num = strList.stream().filter(x -> x.length() > 3).count();
        System.out.println("Num :" + num);

        // Count number of String which starts with "a"
        long acount = strList.stream().filter(x -> x.startsWith("a")).count();
        System.out.println("a Count :" + num);

        // Remove all empty Strings from List
        List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("Stream by removing empty :" + filtered);

        // Create a List with String more than 2 characters
        List<String> sfiltered = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.println("String containing more than 2 char :" + sfiltered);

        // Convert String to uppercase and Join them with coma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println("Strings :" + G7Countries);

        // Create a List of the square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("distinct  :" + distinct);

    }

}
