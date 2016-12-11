import java.util.Scanner;

/**
 * Created by Alexey on 11.10.2016.
 */
public class AreaTriangle {
    public static double measuresLength(double x1, double y1, double x2, double y2) {
        double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите координаты первой точки (х,у): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("введите координаты второй точки (х,у): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("введите координаты третьей точки (х,у) ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double epsilon = 1.0e-3;


        if (Math.abs(x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1) <= epsilon) {
            System.out.println("Вершины треугольника лежат на одной прямой!!!");
        } else {
            double a = measuresLength(x1, y1, x2, y2);
            double b = measuresLength(x2, y2, x3, y3);
            double c = measuresLength(x1, y1, x3, y3);


            double semiPerimeter = (a + b + c) / 2;
            double areaTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            System.out.printf("площадь треугольника = %10.2f", areaTriangle);
        }
    }
}
