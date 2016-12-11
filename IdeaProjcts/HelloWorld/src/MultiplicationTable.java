/**
 * Created by Alexey on 07.11.2016.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int end = 10;
        System.out.print(" * |");
        for (int i = 1; i <= end; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("%n---|");
        for (int i = 1; i <= end; i++) {
            System.out.printf("----");
        }
        System.out.println();
        for (int i = 1; i <= end; i++) {
            System.out.printf("%2d |", i);
            for (int k = 1; k <= end; k++) {
                System.out.printf("%4d", k * i);
            }
            System.out.println();
        }
    }
}

