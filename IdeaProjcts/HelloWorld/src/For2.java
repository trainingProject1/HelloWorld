/**
 * Created by Alexey on 15.10.2016.
 */
public class For2 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        int n = 3;
        for (int i = 1; i <= n; i++) {
            double a = Math.pow(i, 2);
            System.out.println("квадраты чисел: " + a);
        }
        int start = 1;
        int end = 5;
        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            ++count;
        }
        double average = (double)sum / count;

        System.out.println("средне арефметическое от 1 до 5 "+ average);


    }
}
