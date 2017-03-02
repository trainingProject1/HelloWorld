import java.util.Scanner;

/**
 * Created by Alexey on 23.10.2016.
 */
public class Test {
    public static int insertionSort(int numbersCount, int[] masiv) {
        for (int i = 1; i < numbersCount; i++) {
            int t = masiv[i];
            int j;
            for (j = i - 1; j >= 0 && masiv[j] > t; j--) {
                masiv[j + 1] = masiv[j];
            }
            masiv[j + 1] = t;
        }
        return numbersCount;
    }
}