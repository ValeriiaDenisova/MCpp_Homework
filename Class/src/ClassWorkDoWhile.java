
public class ClassWorkDoWhile {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);
		System.out.println();

		int j = -10;
		do {
			System.out.print(j + " ");
			j++;
		} while (j <= 20);
		System.out.println();

		int a = 20;
		do {
			System.out.print(a + " ");
			a--;
		} while (a >= -20);
		System.out.println();

		int b = 1;
		do {
			if (b % 7 == 0)
				System.out.print(b + " ");
			b++;
		} while (b <= 100);
		System.out.println();

		int c = 1;
		do {
			if (c % 3 == 0 && c % 5 == 0)
				System.out.print(c + " ");
			c++;
		} while (c <= 100);
	}
}
