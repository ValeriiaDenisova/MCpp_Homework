import java.util.Arrays;

public class Exercise_3_3 {

	public static void main(String[] args) {
		String str = "London is divided into several parts: the City,Westminster, the West End,and the East End.";
		char[] ch_array = str.toCharArray();
		for (int i = 0; i < ch_array.length; i++) {
			if (ch_array[i] == ',' || ch_array[i] == ':' || ch_array[i] == ';') {
				
			}
		}

	}

	public static String toString(Object[] a) {
		if (a == null)
			return "null";

		int iMax = a.length - 1;
		if (iMax == -1)
			return "[]";

		StringBuilder b = new StringBuilder();

		for (int i = 0;; i++) {
			b.append(String.valueOf(a[i]));
			if (i == iMax)
				return b.toString();
			b.append(", ");
		}
	}

}
