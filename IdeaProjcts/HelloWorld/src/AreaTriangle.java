import java.util.Scanner;

/**
 * Created by Alexey on 11.10.2016.
 */
public class AreaTriangle {
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


        if ((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1) == 0) {
            System.out.println("Вершины треугольника лежат на одной прямой!!!");
        } else {
            double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
            double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

            double semiPerimeter = (a + b + c) / 2;
            double areaTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            System.out.printf("площадь треугольника = " + "%10.2f", areaTriangle);
        }


    }
}
