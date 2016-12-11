/**
 * Created by Alexey on 19.11.2016.
 */
public class BinarySearch {
    public static int binarySearch(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        for ( int middle = (right + left) / 2;;){
            if (a[middle] == x) {
                return middle;
            }
            if (a[middle] > x) {
                right = middle;
            } else if (a[middle] < x) {
                left = middle;
            }
            return middle;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[0];
        for (int i = 1; i < a.length; ++i) {
            a[i] = i;
        }

        int index = binarySearch(a, 0, a.length - 1, 4);
        System.out.println(index);
    }
}
