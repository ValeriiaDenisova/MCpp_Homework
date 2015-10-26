import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_9_Select {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite dlinu massiva ");
        int n = Integer.parseInt(reader.readLine());

        int[] a = new int[n];

        System.out.println("Vvedite elementy massiva ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    int t = a[j];
                    a[j] = a[min];
                    a[min] = t;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
