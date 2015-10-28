
public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 30; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = -10; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 20; i >= -20; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0)
				System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(i + " ");
		}

		System.out.println();
	}

}
