import java.util.Scanner;

/**
 * Created by Alexey on 05.11.2016.
 */
public class ClassWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите строку");
        String line = scanner.nextLine();
        int sumNamber = 0;
        int sumLeter = 0;
        for (int i = 0; i < line.length(); ++i) {
            char c = line.charAt(i);
            if (Character.isDigit(c)) {
                sumNamber++;
            }
            if (Character.isLetter(c)) {
                sumLeter++;
            }
        }
        System.out.println(sumNamber);
        System.out.println(sumLeter);
    }
}
