import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class integersSumStreams {

    public static void main(String[] args) {

        // cannot invoke stream on following array
        // int[] integers = new int[] { 1, 2, 3 };
        ArrayList<Integer> ns = new ArrayList<Integer>();
        ns.add(3);
        ns.add(4);
        ns.add(3);
        ns.add(3);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        // int sum = integers.stream().mapToInt(Integer::intValue).sum();
        int sum = numbers.stream().mapToInt(i -> i.intValue()).sum();
        int sum1 = ns.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println("Total : " + sum);
        System.out.println("Total : " + sum1);

    }

}