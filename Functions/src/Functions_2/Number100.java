package Functions_2;

public class Number100 extends Number {
    private String str_value;
    private Number10 number10;

    public Number100(int value) {

        String sotie_word = "";
        int desiat = value % 100;

        switch (value / 100) {
        case 1:
            sotie_word = "one hundred ";
            break;
        case 2:
            sotie_word = "two hundred ";
            break;
        case 3:
            sotie_word = "three hundred ";
            break;
        case 4:
            sotie_word = "four hundred ";
            break;
        case 5:
            sotie_word = "five hundred ";
            break;
        case 6:
            sotie_word = "six hundred ";
            break;
        case 7:
            sotie_word = "seven hundred ";
            break;
        case 8:
            sotie_word = "eight hundred ";
            break;
        case 9:
            sotie_word = "nine hundred ";
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
