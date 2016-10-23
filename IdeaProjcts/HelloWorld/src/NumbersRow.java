import java.util.Scanner;

/**
 * Created by Alexey on 21.10.2016.
 */
public class NumbersRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите начало номерации: ");
        int start = scanner.nextInt();
        System.out.println("введите конец номерации: ");
        int end = scanner.nextInt();
        int i = start;
        System.out.println("введите количество символов в строке: ");
        int characters = scanner.nextInt();
        int count = 0;
        while (i < end) {
            ++count;
            if (count % characters == 0) {
                System.out.printf("%4d", i);
                System.out.println();
            } else {
                System.out.printf("%4d", i);
            }
            ++i;
        }
    }
}
