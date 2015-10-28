import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperators_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite reiting studenta 0-100 ");
		int a = Integer.parseInt(reader.readLine());

		try {
			String ochenka = fun(a);
			System.out.println(ochenka);
		} catch (NumberFormatException e) {
			System.out.println("Vvedite korrektnyi diapazon");
		}
	}

	public static String fun(int a) {
		String ochenka = null;
		if (a < 0 || a > 100) {
			throw new NumberFormatException();
		}
		if (a > 0 && a <= 19) {
			ochenka = "F";
		} else if (a >= 20 && a <= 39) {
			ochenka = "E";
		} else if (a >= 40 && a <= 59) {
			ochenka = "D";
		} else if (a >= 60 && a <= 74) {
			ochenka = "C";
		} else if (a >= 75 && a <= 89) {
			ochenka = "B";
		} else if (a >= 90 && a <= 100) {
			ochenka = "A";
		}
		return ochenka;
	}
}
