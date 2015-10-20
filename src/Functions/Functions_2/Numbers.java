package Functions.Functions_2;

public class Numbers {

    /*
     * public String number0 = "ноль"; public String[] number1_9 = {"один",
     * "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
     * public String[] number10_19 = {"десять", "одиннадцать", "двенадцать",
     * "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
     * "восемнадцать", "девятнадцать"}; public String[] number20_90 =
     * {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
     * "восемьдесят", "девяносто"}; public String[] number100_900 = {"сто",
     * "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
     * "восемьсот", "девятьсот"};
     */
    public String inWords(int n) {

	int digital = 0;
	String word = "";
	String str = "";

	Numbers100_900 numbers100_900 = new Numbers100_900();
	Numbers20_90 numbers20_90 = new Numbers20_90();
	Numbers1_19 numbers1_19 = new Numbers1_19();

	numbers100_900.number100_900(n);
	numbers20_90.number20_90(n);
	numbers1_19.number1_19(n);

    }
}
