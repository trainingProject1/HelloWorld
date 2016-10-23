import java.util.Scanner;

/**
 * Created by Alexey on 16.10.2016.
 */
public class SwitchHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите команду: ");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("результат сложения будет = " + (a + b));
                break;
            case 2:
                System.out.println("результат вычитания будет = " + (a - b));
                break;
            case 3:
                System.out.println("результат умножения будет = " + (a * b));
                break;
            case 4:
                System.out.println("результат деления будет = " + (a / b));
                break;
            default:
                System.out.println("неизвестная опрерация!!!");
        }
    }
}
