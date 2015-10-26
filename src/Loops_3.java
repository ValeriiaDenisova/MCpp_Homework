import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_3 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite chislo ");
        int x = Integer.parseInt(reader.readLine());

        int a, b;
        b = x;
        do {
            a = b;
            b = (a + x / a) / 2;
        } while (a > b);
        System.out.println(a);
    }
}
