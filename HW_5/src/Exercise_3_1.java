import java.util.Arrays;

public class Exercise_3_1 {

	public static void main(String[] args) {

		String str = "London is divided into several parts: the City, Westminster, the West End, and the East End.";
		String [] str_array = str.split("[\\s,.!:]+");
		String min = str_array[0];
		for(int i = 0; i < str_array.length; i++){
			if (str_array[i].length() < min.length()){
				min = str_array[i];
			}
		}
		System.out.println(Arrays.toString(str_array));
		System.out.println("Min word = " + min);
		System.out.println("Lengs = " + min.length());
	}

}
