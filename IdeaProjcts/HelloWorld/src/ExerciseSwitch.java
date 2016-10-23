import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Alexey on 08.10.2016.
 */
public class ExerciseSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите команду");
        String command = scanner.nextLine();
        switch (command) {
            case "print":
                System.out.println("выскажите мнение о курсах:");
                String recall = scanner.nextLine();
                System.out.println(recall + "!!!");
                break;
            case "sum":
                System.out.println("Введите первое вещественное число");
                double firstNumber = scanner.nextDouble();
                System.out.println("Введите второе вещественное число");
                double secondNumber = scanner.nextDouble();
                System.out.println("Сумма = " + (firstNumber + secondNumber));
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
