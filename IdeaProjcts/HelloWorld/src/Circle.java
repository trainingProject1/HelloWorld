/**
 * Created by Alexey on 23.09.2016.
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("При радиусе =" + radius + System.lineSeparator() + "площадь окружности будет =" + area + System.lineSeparator() + "А длина составит =" + circumference);

        area = 16;/*найти радиус
        через площадь*/
        radius = Math.sqrt(area / Math.PI);
        System.out.println("а если площадь окружности будет =" + area + System.lineSeparator() + "то радиус будет равен =" + radius);

        int alpha = 90;
        area = Math.PI * Math.pow(radius, 2) * (alpha / 360.0);
        System.out.println("площадь сектора с углом Alpha =" + alpha + ", будет =" + area);
    }
}

