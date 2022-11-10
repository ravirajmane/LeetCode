import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 30, 50, 20, 50, 10, 20, 30, 10, 10, 40 };
        removeDupli(arr);
    }

    public static void removeDupli(int a[]) {
        int n = a.length;
        HashSet<Integer> hs = new HashSet<>();

        for (Integer e : a) {
            if (!hs.contains(e)) {
                hs.add(e);
            }

        }

        System.out.println(" arr : " + hs);
    }
}
