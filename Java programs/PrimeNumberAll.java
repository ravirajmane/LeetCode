public class PrimeNumberAll {
    public static void main(String[] args) {
        int a = 4;
        boolean flag = false;
        for (int i = 2; i < a; i++)
            if (a % i == 0) {
                flag = true;

            }

        if (flag == true)
            System.out.println("not prime");
        else if (flag == false) {
            System.out.println("prime");
        }
    }
}
