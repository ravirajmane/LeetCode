package HashMap;

import java.util.HashMap;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // }

        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "Jhon");
        customers.put(2, "Smith");
        customers.put(3, "Sally");

        for (Integer key : customers.keySet()) {
            System.out.println("Key : " + key + " value : " + customers.get(key));
        }

    }

}
