package number;

public class Number100 extends Number {
    private String str_value;
    private Number10 number10;

    public Number100(int value) {

        String sotie_word = "";
        int desiat = value % 100;

        switch (value / 100) {
        case 1:
            sotie_word = "сто ";
            break;
        case 2:
            sotie_word = "двести ";
            break;
        case 3:
            sotie_word = "триста ";
            break;
        case 4:
            sotie_word = "четыреста ";
            break;
        case 5:
            sotie_word = "пятьсот ";
            break;
        case 6:
            sotie_word = "шестьсот ";
            break;
        case 7:
            sotie_word = "семьсот ";
            break;
        case 8:
            sotie_word = "восемьсот ";
            break;
        case 9:
            sotie_word = "девятьсот ";
            break;

        default:
            break;
        }
        this.str_value = sotie_word;

        number10 = new Number10(desiat);
    }

    public String getStringPresentation() {
        return this.str_value + number10.getStringPresentation();
    }
}
