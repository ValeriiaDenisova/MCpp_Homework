package Functions.Functions_2;

public class Numbers20_90 {
	
	public int number20_90 (int n) {
	
	int digital = 0;
	String word = "";
	String str = "";

	if (n < 100 && n >= 20) {
		digital = n / 10;
	switch (n) {
	case 2:
		word = "двадцать";
		break;
	case 3:
		word = "тридцать";
		break;
	case 4:
		word = "сорок";
		break;
	case 5:
		word = "пятьдесят";
		break;
	case 6:
		word = "шестьдесят";
		break;
	case 7:
		word = "семьдесят";
		break;
	case 8:
		word = "восемьдесят";
		break;
	case 9:
		word = "девяносто";
		break;

	default:
		break;
	}
}
	str = str + " " + word;
	n = n - digital * 10;
	return n;
	
}
}
