
import java.util.stream.IntStream;

public class PrimeStreams {

    public static void main(String args[]) {
        IntStream.rangeClosed(2, 12).filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i)).allMatch(j -> i % j != 0))
                .forEach(n -> {
                    System.out.println(n);
                });
    }
}