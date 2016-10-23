import java.util.Scanner;

/**
 * Created by Alexey on 20.10.2016.
 */
public class draft {
    public static void main(String[] args) {
        int x = 123;
        int n = 3;
        int a = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("i" + i);
            int fibonacci = 0;
            int digit = (x / (int) Math.pow(10, i - 1)) % 10;
            System.out.println("," + digit);
             sum += digit;
           // fibonacci = a + digit;
          //  a = digit;
          //  digit = fibonacci;
            //i++;

            System.out.println("*" + sum);

        }
    }
}
