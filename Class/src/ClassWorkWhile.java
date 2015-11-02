
public class ClassWorkWhile {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		int j = -10;
		while (j <= 20) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();

		int a = 20;
		while (a >= -20) {
			System.out.print(a + " ");
			a--;
		}
		System.out.println();

		int b = 1;
		while (b <= 100) {
			if (b % 7 == 0)
				System.out.print(b + " ");
			b++;
		}
		System.out.println();

		int c = 1;
		while (c <= 100) {
			if (c % 3 == 0 && c % 5 == 0)
				System.out.print(c + " ");
			c++;
		}

	}

}
