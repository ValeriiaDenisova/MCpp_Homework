
public class Stars3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j || j == 1 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j == 8 || j == 1 || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j || j == 7 || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j == 8 || j == 7 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}
}
