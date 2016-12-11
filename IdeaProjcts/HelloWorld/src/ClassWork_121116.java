/**
 * Created by Alexey on 12.11.2016.
 */
public class ClassWork_121116 {
    public static int findNumberInArray(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static double average(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                ++count;
            }
        }
        double average = (double) sum / count;
        return average;
    }
    

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 10, 2};
        int a = findNumberInArray(array, 9);
        System.out.println(a);
        double b = average(array);
        System.out.println(b);
    }
}
