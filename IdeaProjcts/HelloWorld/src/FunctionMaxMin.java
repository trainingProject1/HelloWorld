/**
 * Created by Alexey on 22.10.2016.
 */
public class FunctionMaxMin {
    public static double max(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static double min(double x, double y) {
        return (x < y) ? x : y;
    }
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(min(9, 6));
    }
}
