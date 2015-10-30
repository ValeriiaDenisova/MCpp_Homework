import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite chislo ");
		int x = Integer.parseInt(reader.readLine());

		try {
			int sqrt = sqrt(x);
			System.out.println(sqrt);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public static int sqrt(int x) {
		if (x == 0) {
			throw new ArithmeticException();
		}
		int a, b;
		b = x;
		do {
			a = b;
			b = (a + x / a) / 2;
		} while (a > b);
		return a;
	}
}
