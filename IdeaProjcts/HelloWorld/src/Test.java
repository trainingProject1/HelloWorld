
/**
 * Created by Alexey on 23.10.2016.
 */
public class Test {

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arrey = {323, 4678, 9, 234, 12, 15};
        int[] result = bubbleSort(arrey);
        for (int number : arrey) {
            System.out.println(number);

        }
    }
}