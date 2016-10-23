/**
 * Created by Alexey on 21.10.2016.
 */
public class Cycles3 {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;
        int i = start;
        int sum = 0;
        int count = 0;
        do {
            sum += i;
            ++count;
            ++i;
        } while (i <= end); {
            double average = (double) sum / count;
            System.out.println(average);
        }
    }
}
