
public class Function {

	public static String fun_1(int a) {
		String str = Integer.toString(a);
		return str;
	}

	public static String fun_2(float a) {
		String str = Float.toString(a);
		return str;
	}

	public static int fun_3(String str) {
		int a = 0;
		try {
			a = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Format error");
		}
		return a;
	}

	public static float fun_4(String str) {
		float a = 0;
	    try {
			a = Float.parseFloat(str);
			return a; 
	    } catch (NumberFormatException e) {
	        System.err.println("Format error");
	    }
		return 0;
	}
}
