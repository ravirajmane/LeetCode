package Streams;

import java.util.ArrayList;
import java.util.List;

public class FilterintoFilter {
    public static void main(String[] args) {
        List<String> brands = new ArrayList<String>();
        brands.add("samsung");
        brands.add("apple");

        brands.add("boss");
        brands.add("nautica");

        List<String> electronicsBrands = new ArrayList<String>();
        electronicsBrands.add("samsung");
        electronicsBrands.add("apple");
        electronicsBrands.add("lenovo");

        System.out.println("electronics-brands which are in brands list: ");
        brands.stream().filter(s -> {
            return electronicsBrands.contains(s) ? true : false;
        }).forEach(s -> {
            System.out.println(s);
        });
    }

}
