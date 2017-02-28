import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) throws FileNotFoundException {

        int numbersCount = 6;
        int[] numbers = new int[numbersCount];//создаем масив

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) { //файл для чтения
            // String line = scanner.nextLine();

            for (int i = 0; i < numbersCount; ++i) {//заполняем масив
                numbers[i] = scanner.nextInt();
            }
        }

        // Сортировка методом вставки
        for (int i = 0; i < numbersCount; i++) {
            int t = numbers[i];
            int j;
            for (j = i - 1; j >= 0 && numbers[j] > t; j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = t;
        }

        try (PrintWriter writer = new PrintWriter("output.txt")) {//файл для записи отсортированных даных

            for (int number : numbers) {
                System.out.println(number);
                writer.println(number);
            }
        }
    }
}