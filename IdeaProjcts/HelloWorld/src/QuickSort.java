import java.util.Random;

/**
 * Created by Alexey on 17.03.2017.
 */
public class QuickSort {
    public static int[] qSort(int[] arrey, int l, int r) {
        int i = l;
        int j = r;
        Random rand = new Random();
        int left = arrey[l + rand.nextInt (r - l + 1)];
        while (i <= j) {
            while (arrey[i] < left) {
                i++;
            }
            while (arrey[j] > left) {
                j--;
            }
            if (i <= j) {
                int temp = arrey[i];
                arrey[i] = arrey[j];
                arrey[j] = temp;
                i++;
                j--;
            }
        }
        if (l<j){
            qSort(arrey, l, j);
        }
        if(i<r){
            qSort(arrey, i, r);
        }
        return arrey;
    }

    public static void main(String[] args) {
        int[] arrey = {323, 4678, 9, 234, 12, 15};
        int[] result = qSort(arrey, 0,5);
        for (int number : arrey) {
            System.out.println(number);

        }
    }
}
