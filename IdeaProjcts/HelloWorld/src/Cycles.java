import static java.lang.System.out;

/**
 * Created by Alexey on 08.10.2016.
 */
public class Cycles {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        while (i <= 9) {
            sum += i;
            ++i;
        }
        out.println("Сумма= " + sum);
        i = 3;
        sum = 0;
        while (i <= 21) {
            sum += i;
            ++i;
        }
        out.println("Сумма = " + sum);

        i = 3;
        sum = 0;
        int amountOfNumbers = 0;
        while (i <= 21) {
            if (i % 2 == 0) {
                sum += i;
                ++amountOfNumbers;
            }
            ++i;

        }
        System.out.println("Сумма четных чисел = " + sum);
        System.out.println("колличество четных чисел = " + amountOfNumbers);


    }

}


