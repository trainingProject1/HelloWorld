import java.util.Scanner;

/**
 * Created by Alexey on 07.10.2016.
 */
public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Наибольшее число " + a + " Наименьшее число " + b);

        } else {
            System.out.println("Наибольшее число " + b + " Наименьшее число " + a);
        }
        int max = a > b ? a : b;
        System.out.println("наибольшее " + max);

        int min = a < b ? a : b;
        System.out.println("Наименьшее " + min);

    }
}
