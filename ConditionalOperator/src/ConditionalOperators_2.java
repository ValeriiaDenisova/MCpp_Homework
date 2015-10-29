import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperators_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite x");
		int x = Integer.parseInt(reader.readLine());
		System.out.println("Vvedite y");
		int y = Integer.parseInt(reader.readLine());

		try {
			int rez = fun(x, y);
			System.out.println(rez + " chetvert");
		} catch (IllegalArgumentException e) {
			System.out.println("Tochka legit na osi koordinat");
		}
	}

	public static int fun(int x, int y) {
		if (x == 0 || y == 0) {
			throw new IllegalArgumentException();
		}
		int chetvert = 0;
		if (x > 0 & y > 0) {
			chetvert = 1;
		} else if (x < 0 & y > 0) {
			chetvert = 2;
		} else if (x < 0 & y < 0) {
			chetvert = 3;
		} else if (x > 0 & y < 0) {
			chetvert = 4;
		}
		return chetvert;
	}
}
