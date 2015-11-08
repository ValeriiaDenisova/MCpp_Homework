
public class Numbers2 {

	public static void main(String[] args) {
		/** 1 **/
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j <= 8) {
					System.out.print(j + i - 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		/** 2 **/
		for (int i = 7; i >= 1; i--) {
			for (int j = 7; j >= 1; j--) {
				if (i <= j) {
					System.out.print(j - i + 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
