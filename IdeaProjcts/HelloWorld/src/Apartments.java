import java.util.Scanner;

/**
 * Created by Alexey on 28.09.2016.
 */
public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей");
        int numberOfFloors = scanner.nextInt();
        System.out.println("Введите количество подъездов");
        int numberOfEntrances = scanner.nextInt();
        System.out.println("Введите номер квартиры");
        int room = scanner.nextInt();
        int numberOfApartmentsPerFloor = 4;

        if ((room > 0) && (room <= numberOfFloors * numberOfEntrances * numberOfApartmentsPerFloor)) {
            int porch = (int) Math.ceil((double) room / (numberOfFloors * numberOfApartmentsPerFloor)); // номер подъезда
            System.out.println(porch + "й подъезд");
            int floor = (int) Math.ceil(room % (double) (numberOfFloors * numberOfApartmentsPerFloor) / numberOfApartmentsPerFloor);// номер этажа
            if (floor != 0) {
                System.out.println(floor + "й этаж");
            } else {
                System.out.println(floor + numberOfFloors + "й этаж");
            }
            int locations = room % numberOfApartmentsPerFloor;
            if (locations == 1) {
                System.out.println("Квартира ближняя слева");
            }
            if (locations == 2) {
                System.out.println("Квартира дальняя слева");
            }
            if (locations == 3) {
                System.out.println("Квартира дальняя справа");
            }
            if (locations == 0) {
                System.out.println("Квартира ближняя справа");
            }
        }else {
                System.out.println("Такой квартиры не существует!!!");
                }

    }
}
