import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_7 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite dlinu massiva ");
        int n = Integer.parseInt(reader.readLine());

        int[] a = new int[n];

        System.out.println("Vvedite elementy massiva ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                j++;
            }
        }
        System.out.println(j);
    }
}
