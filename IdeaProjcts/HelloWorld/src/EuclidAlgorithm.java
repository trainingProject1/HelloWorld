import java.util.Scanner;

/**
 * Created by Alexey on 07.11.2016.
 */
public class EuclidAlgorithm {
    static int greatestCommonDivisor(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a + b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println(greatestCommonDivisor(a, b));
    }
}



