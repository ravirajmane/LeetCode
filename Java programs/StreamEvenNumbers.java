import java.util.List;

import java.util.stream.Collectors;

public class StreamEvenNumbers {
    public static void main(String[] args) {
        List<Integer> li = List.of(2, 3, 5, 6);
        List<Integer> evenli = li.stream().filter(x -> (x % 2 == 0)).collect(Collectors.toList());
        System.out.println(evenli);
    }
}
