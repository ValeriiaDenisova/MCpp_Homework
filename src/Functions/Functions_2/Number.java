package Functions.Functions_2;

public abstract class Number {

    public static String getNumber(int value) {
        if (value == 0) {
            return "ноль";
        }

        if (value >= 100) {
            return new Number100(value).getStringPresentation();
        }

        if (value >= 10 && value < 100) {
            return new Number10(value).getStringPresentation();
        }

        if (value < 10) {
            return new Number1(value).getStringPresentation();
        }
        return "";
    }
}
