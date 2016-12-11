/**
 * Created by Alexey on 19.11.2016.
 */
public class ClassWork_191116 {
    public static int pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return pow(x, y - 1) * x;
    }

    public static int pow2(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; ++i) {
             result *= x;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(pow2(2,4));
    }
}

