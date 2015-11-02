
public class Stars4 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4 || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if ((i == j && i + j <= 8) || (i + j == 8) || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if ((i == j && i + j > 8) || (i + j == 8 && i <= 4) || j == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 4; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if ((i == j && i + j >= 8) || (i + j == 8 && i > 4) || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
