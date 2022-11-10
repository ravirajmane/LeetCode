import java.util.ArrayList;

public class ArraylistStringLambda {
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<>();

        lang.add("C");
        lang.add("Java");
        lang.add(".net");

        System.out.println("List :");
        lang.forEach((e) -> {
            System.out.println(e + ",");
        });
    }
}
