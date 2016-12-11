import java.util.Scanner;

/**
 * Created by Alexey on 23.10.2016.
 */
public class DigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int sumOddNamber = 0;
        int max = 0;
        while (number != 0) {
            int figureAmong = (number % 10);
            sum = sum + figureAmong;
            if (figureAmong % 2 != 0) {
                sumOddNamber = sumOddNamber + figureAmong;
            }
            if (max < figureAmong) {
                max = figureAmong;
            }
            number /= 10;
        }
        System.out.println(sum);
        System.out.println(sumOddNamber);
        System.out.println("max " + max);
    }
}
