import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Alexey on 02.03.2017.
 */
public class BobbleSort {
    public static int[] bubbleSort(int[] arr) {                   //функция сортировки пузырьком
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws FileNotFoundException {

        int numbersCount = 6;
        int[] numbers = new int[numbersCount];//создаем масив

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) { //файл для чтения

            for (int i = 0; i < numbersCount; ++i) {//заполняем масив
                numbers[i] = scanner.nextInt();
            }
        }
        int[] namber = bubbleSort(numbers);

        try (PrintWriter writer = new PrintWriter("output.txt")) {//файл для записи отсортированных даных

            for (int number : numbers) {
                System.out.println(number);
                writer.println(number);
            }
        }
    }
}

