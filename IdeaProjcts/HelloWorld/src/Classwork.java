/**
 * Created by Alexey on 22.10.2016.
 */
public class Classwork {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {

            if (i == 5) {
                continue;
            }

            if (i >= 60 && i <= 80) {
                continue;

            }
            if (i%3==0){
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
