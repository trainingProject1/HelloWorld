import java.util.Scanner;

/**
 * Created by Alexey on 23.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.useDelimiter(";\\s*");
        double sum = 0;
        while (scan.hasNext()) {

            if (scan.hasNextDouble())

                sum += scan.nextDouble();

            else System.out.println(scan.next());

        }

        System.out.printf("Сумма чисел = " + sum);
    }
}