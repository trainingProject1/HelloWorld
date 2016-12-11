import java.util.Scanner;

/**
 * Created by Alexey on 07.11.2016.
 */
public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер вклада ");
        double deposit = scanner.nextDouble();
        System.out.println("Введите  процентную ставку ");
        double interestRate = scanner.nextDouble();
        System.out.println("На сколько месяцев положили деньги ");
        int periodDeposit = scanner.nextInt();

        double sum = deposit;
        final int PERCENT = 100;
        final int MONTHS = 12;

        for (int i = 0; i < periodDeposit; i++) {
            sum = sum + sum / PERCENT * (interestRate / MONTHS) ;
        }
        System.out.printf("Теперь размер вклада:  %.2f, прибыль:  %.2f", sum, (sum - deposit));
    }
}
