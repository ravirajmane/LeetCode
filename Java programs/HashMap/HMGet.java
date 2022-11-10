package HashMap;

import java.util.HashMap;

import javax.sound.sampled.SourceDataLine;

//https://www.programiz.com/java-programming/hashmap
class HMGet {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Java");
        hmap.put(2, "Python");
        hmap.put(3, "JavaScript");
        hmap.put(4, "C");
        hmap.put(5, "C++");
        hmap.put(6, "Ruby");

        int n = hmap.size();
        // using keySet()
        for (Integer k : hmap.keySet()) {
            if (k % 2 != 0)
                System.out.println("Odd keys" + k);
        }
        for (String s : hmap.values()) {
            if (s.startsWith("J")) {
                System.out.println("Values starting with J : " + s);
            }
        }
        String hmap_value = hmap.get(5);
        System.out.println("Value at 5 is :  " + hmap_value);
        System.out.println("Keys: " + hmap.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + hmap.values());

        // System.out.println("HashMap: " + hmap);
        // for (Integer a : hmap.keySet()) {
        // System.out.println("Key : " + a);
        // }

        // for (String b : hmap.values()) {
        // System.out.println("Value : " + b);
        // }

        System.out.println("Key/Value mappings: " + hmap.entrySet());
        // get() method to get value
        // String value = hmap.get(1);
        // System.out.println("Value at index 1: " + value);
    }
}