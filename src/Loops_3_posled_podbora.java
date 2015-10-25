import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_3_posled_podbora {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite chislo ");
        int x = Integer.parseInt(reader.readLine());

        int i = 1;
        int rez = 1;

        while (rez < x) {
            rez = i * i;
            i++;
        }
        System.out.println(i-1);
    }
}
