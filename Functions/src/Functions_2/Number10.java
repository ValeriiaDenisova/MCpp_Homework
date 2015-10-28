package Functions_2;

public class Number10 extends Number {
    private Number1 number1;
    private String str_value;

    public Number10(int value) {

        String desiat_word = "";
        int edin = value % 10;

        switch (value / 10) {
        case 2:
            desiat_word = "twenty ";
            break;
        case 3:
            desiat_word = "thirty ";
            break;
        case 4:
            desiat_word = "forty ";
            break;
        case 5:
            desiat_word = "fifty ";
            break;
        case 6:
            desiat_word = "sixty ";
            break;
        case 7:
            desiat_word = "seventy ";
            break;
        case 8:
            desiat_word = "eighty ";
            break;
        case 9:
            desiat_word = "ninety ";
            break;

        default:
            break;
        }
        this.str_value = desiat_word;
        
        number1 = new Number1(edin);
    }
    
    public String getStringPresentation (){
        return this.str_value + number1.getStringPresentation();
    }
}
