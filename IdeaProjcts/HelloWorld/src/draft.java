import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 * Created by Alexey on 21.01.2017.
 */
public class Draft {
    public static void main(String[] args) {

    }

    public  void  setArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = min(array, i, n - 1);
            swap(array, i, minIndex);
        }
    }

    private void swap(int[] array, int i, int minIndex) {
    }
}