public class Calc {

	public static int calc(int a, int b, char op) {
		int rez = 0;

		if (op == '+') {
			rez = a + b;
		} else if (op == '-') {
			rez = a - b;
		} else if (op == '*') {
			rez = a * b;
		} else if (op == '/') {
			rez = a / b;
		} else {
			throw new IllegalArgumentException();
		}
		return rez;
	}
}
