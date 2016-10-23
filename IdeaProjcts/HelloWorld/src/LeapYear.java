import java.util.Scanner;

/**
 * Created by Alexey on 08.10.2016.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("этот год является высокосным!!!");
        } else {
            System.out.println("этот год не является высокосным!!!");
        }

    }
}
