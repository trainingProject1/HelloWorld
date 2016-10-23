

/**
 * Created by Alexey on 08.10.2016.
 */
public class Cycles2 {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;


        int i = start;
        int sum = 0;
        int count = 0;
        while (i <= end) {
            sum += i;
            ++count;
            ++i;
        }
        double average = (double) sum / count;
        System.out.println(average);
    }
}
