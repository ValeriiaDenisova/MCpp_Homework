package Functions_2;

public class Number1 extends Number {
    private String str_value;

    public Number1(int value) {

        String edin_word = "";

        switch (value) {
        case 1:
            edin_word = "one";
            break;
        case 2:
            edin_word = "two";
            break;
        case 3:
            edin_word = "three";
            break;
        case 4:
            edin_word = "four";
            break;
        case 5:
            edin_word = "five";
            break;
        case 6:
            edin_word = "six";
            break;
        case 7:
            edin_word = "seven";
            break;
        case 8:
            edin_word = "eight";
            break;
        case 9:
            edin_word = "nine";
            break;

        default:
            edin_word = "";
            break;
        }
        this.str_value = edin_word;
    }
 
    public String getStringPresentation(){
        return str_value;
    }
}
