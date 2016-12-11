import java.util.Scanner;

/**
 * Created by Alexey on 07.11.2016.
 */
public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String name = "aaa";
        String stranger = scanner.nextLine();

        while (!stranger.equals(name)) {
            System.out.println("пароль  не верный!!!");
            System.out.println("Введите пароль: ");
            stranger = scanner.nextLine();
            if (stranger.equals(name)) {
                break;
            }
        }
        System.out.println("пароль верный!!!");
    }
}