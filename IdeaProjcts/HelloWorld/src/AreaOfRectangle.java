/**
 * Created by Alexey on 01.10.2016.
 */
public class AreaOfRectangle {
    public static void main(String[] args) {
        double width = 5.5; // ширина прямоугольника
        double length = 7.5; // длина прямоугольника
        double perimeter = (width * length) * 2;
        double area = (width * length);
        System.out.printf("периметр прямоугольника =%10.2f %nплощать прямоугольника =%11.2f",perimeter, area);
    }
}
