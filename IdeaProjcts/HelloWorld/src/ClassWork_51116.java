/**
 * Created by Alexey on 05.11.2016.
 */
public class ClassWork_51116 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; ++i) {
            array[i] = i + 1;

            // System.out.print(" " + array[i]);
        }
        for (int e : array) {
            System.out.println(e);
        }
    }
}
