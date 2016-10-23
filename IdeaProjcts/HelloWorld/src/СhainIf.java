import java.util.Scanner;

/**
 * Created by Alexey on 01.10.2016.
 */
public class СhainIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите число");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("число положительное");
        } else if (a == 0) {
            System.out.println("число = 0");
        } else {
            System.out.println("число отрицательное");
        }
    }
}
