import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_9_Bubble {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite dlinu massiva ");
        int n = Integer.parseInt(reader.readLine());

        int[] a = new int[n];

        System.out.println("Vvedite elementy massiva ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
