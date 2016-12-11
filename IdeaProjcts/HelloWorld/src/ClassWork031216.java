import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Alexey on 03.12.2016.
 */
public class ClassWork031216 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("input.txt"));

        int numbersCount = scanner.nextInt();
        double[] numbers = new double[numbersCount];

        for (int i = 0; i < numbersCount; ++i) {
            numbers[i] = scanner.nextDouble();
        }

        for (double e : numbers) {
            System.out.println(e);
        }
        scanner.close();
    }
}
