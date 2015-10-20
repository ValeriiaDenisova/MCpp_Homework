package Functions.Functions_2;

public class Numbers100_900 {
	public int number100_900 (int n) {
		
		int digital = 0;
		String word = "";
		String str = "";
		
		if (n < 1000 && n >= 100)
			digital = n / 100;
		switch (n) {
		case 1:
			word = "сто";
			break;
		case 2:
			word = "двести";
			break;
		case 3:
			word = "триста";
			break;
		case 4:
			word = "четыреста";
			break;
		case 5:
			word = "пятьсот";
			break;
		case 6:
			word = "шестьсот";
			break;
		case 7:
			word = "семьсот";
			break;
		case 8:
			word = "восемьсот";
			break;
		case 9:
			word = "девятьсот";
			break;

		default:
			break;
		}
		
		str = word;
		n = n - digital * 100;
		return n;
		
	}
}
