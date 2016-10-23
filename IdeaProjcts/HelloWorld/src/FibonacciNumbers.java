import java.util.Scanner;

/**
 * Created by Alexey on 20.10.2016.
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Число фибоначи = " + 0);
        } else if (n == 1) {
            System.out.println("Число фибоначи = " + 1);
        } else if (n == 2) {
            System.out.println("Число фибоначи = " + 1);
        } else {
            int a = 1;
            int b = 1;
            int fibonacci = 2;
            int i = 2;
            while (i < n) {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
                i++;
            }
            System.out.println("Число фибоначи = " + fibonacci);
        }
    }
}
