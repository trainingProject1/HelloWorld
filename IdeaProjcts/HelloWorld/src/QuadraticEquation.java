import java.util.Scanner;

import static javafx.scene.input.KeyCode.X;

/**
 * Created by Alexey on 11.10.2016.
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый коэффициент = ");
        double coefficientA = scanner.nextInt();
        System.out.println("Введите второй коэффициент = ");
        double coefficientB = scanner.nextInt();
        System.out.println("Введите третий коэффициент = ");
        double coefficientC = scanner.nextInt();

        double discriminant = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
        if (discriminant > 0) {
            double x1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            double x2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
            System.out.println("Уровнение имеет два корня: х1 =" + x1 + " x2 =" + x2);
        } else if (discriminant == 0) {
            double x = -coefficientB / (2 * coefficientA);
            System.out.println("Уровнение имеет один корень: х = " + x);
        } else {
            System.out.println("Корней нет!!!");
        }
        double coefficientX;
       // if (coefficientA * Math.pow(coefficientX, 2) + coefficientB * coefficientX + coefficientC == 0) {
     //   }
        // if ((coefficient_a == 0) && (coefficient_b == 0) && (coefficient_c == 0)) {
        //   double x = (-coefficient_b) / (2 * coefficient_a);
        // System.out.println("корень" + x);}


    }
}
