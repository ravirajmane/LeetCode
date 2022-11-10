import java.util.HashMap;
import java.util.Scanner;

public class Hashmapexample {
    public static void main(String[] args) {
        // create hashmap
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 5);
        map.put(2, 4);
        map.put(3, 5);
        map.put(4, 6);
        map.put(5, 2);
        map.put(6, 4);

        System.out.print("Enter a server: ");
        int a = sc.nextInt();

        if (map.containsKey(a)) {

            Integer val = map.get(a);

            System.out.println("value for server is :" + val);
        } else {
            System.out.print("Server value is not present: ");
        }
    }

}