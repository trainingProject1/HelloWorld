import java.util.Random;

/**
 * Created by Alexey on 17.03.2017.
 */
public class QuickSort {
    public static int[] qSort(int[] array, int l, int r) {
        int i = l;
        int j = r;
        Random rand = new Random();
        int x = array[l + rand.nextInt (r - l + 1)];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (l<j){
            qSort(array, l, j);
        }
        if(i<r){
            qSort(array, i, r);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrey = {323, 4678, 9, 234, 12, 15};
        int[] result = qSort(arrey, 0,5);
        for (int number : arrey) {
            System.out.println(number);

        }
    }
}
