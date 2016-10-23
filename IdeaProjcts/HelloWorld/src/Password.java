import java.util.Scanner;

/**
 * Created by Alexey on 07.10.2016.
 */
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "elephant";
        int passwordLength = password.length();
        System.out.println("Введите пароль: ");
        String userLine = scanner.nextLine();
        int userLineLength = userLine.length();
        if (password.equals(userLine)) {
            System.out.println("пароль правельный");
        } else if (passwordLength < userLineLength) {
            System.out.println("пароль не верный и строка слишком длинная");
        } else if (passwordLength > userLineLength) {
            System.out.println("пароль не верный и строка слишком короткая");
        } else {
            System.out.println("пароль не верный");
        }
    }
}