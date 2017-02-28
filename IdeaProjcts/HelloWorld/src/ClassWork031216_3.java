import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Alexey on 03.12.2016.
 */
public class ClassWork031216_3 {
    public static void main(String[] args) throws IOException{
        try   (PrintWriter writer = new PrintWriter("output.txt")) {
             writer.println("домой хочу!!!");
        }
    }
}
