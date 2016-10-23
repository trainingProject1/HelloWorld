import java.util.Scanner;

/**
 * Created by Alexey on 01.10.2016.
 */
public class IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите число");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Данное число положительное");
        }
        if (a < 0) {
            System.out.println("Данное число отрицательное");
        }
        if (a % 2 == 0) {
            System.out.println("Число четное");
        }
        if (a % 5 ==0){
            System.out.println("Число кратно 5");
        }
    }
}
