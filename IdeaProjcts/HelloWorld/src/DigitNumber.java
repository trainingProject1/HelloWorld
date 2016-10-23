import java.util.Scanner;

/**
 * Created by Alexey on 23.10.2016.
 */
public class DigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        //int x = scanner.nextInt();
        String a = scanner.nextLine();
        // System.out.println(a);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= a.length(); i++) {
            int digit = (x / (int) Math.pow(10, i - 1)) % 10;
            sum += digit;
        }
        System.out.println(sum);
    }
}
