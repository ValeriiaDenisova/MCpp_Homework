import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
				for(int i = 1; i <= 7; i++){
			for (int j = 1; j <= 7; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();


		for(int i = 1; i <= 7; i++){
			for (int j = 1; j <= 7; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 7; i >= 1; i--){
			for (int j = 7; j >= 1; j--){
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 7; i >= 1; i--){
			for (int j = 7; j >= 1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();


		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int[] b = new int [7];
		int temp;
			for (int i = 1; i <= 7; i++){
				b[i] = arr[i+1];
				System.out.println(Arrays.toString(b));


		}


	}
}
