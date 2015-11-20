public class Exercise_3_3 {

	public static void main(String[] args) {
		String str = "London,is divided into several parts: the City,Westminster, the West End,and the East End.";
		System.out.println(insertSpace(str));
	}

	public static String insertSpace(String massString) {
		massString = massString.replaceAll(",(?!\\s)", ", ");
		return massString;
	}
}