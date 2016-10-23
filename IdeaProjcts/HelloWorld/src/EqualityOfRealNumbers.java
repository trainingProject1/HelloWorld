import java.util.Scanner;

/**
 * Created by Alexey on 08.10.2016.
 */
public class EqualityOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        double a = scanner.nextDouble();
        System.out.println("введите второе число");
        double b = scanner.nextDouble();
        double epsilon = 1.0e-3;
        if (Math.abs(a - b) <= epsilon) {
            System.out.println("a примерно равен " + b);
        }else {
            System.out.println(" не равны");
        }
    }
}
