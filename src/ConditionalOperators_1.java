import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperators_1 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite а");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Vvedite b");
        int b = Integer.parseInt(reader.readLine());

        int rez;
        if (a % 2 == 0) {
            rez = a * b;
        } else {
            rez = a + b;
        }
        System.out.println(rez);
    }
}
