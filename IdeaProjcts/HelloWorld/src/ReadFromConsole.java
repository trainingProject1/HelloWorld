import java.util.Scanner;

/**
 * Created by Alexey on 24.09.2016.
 */
public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину прмоугольника");
        double length = scanner.nextDouble();
        System.out.println("Введите ширину прямоуголника");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("площадь составит = " + area);
        double perimeter = (length + width) * 2;
        System.out.println(" периметр составит = " + perimeter);
    }
}
