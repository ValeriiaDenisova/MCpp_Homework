package number;

public class Number10 extends Number {
    private Number1 number1;
    private String str_value;

    public Number10(int value) {

        String desiat_word = "";
        int edin = value % 10;

        switch (value / 10) {
        case 2:
            desiat_word = "двадцать ";
            break;
        case 3:
            desiat_word = "тридцать ";
            break;
        case 4:
            desiat_word = "сорок ";
            break;
        case 5:
            desiat_word = "пятьдесят ";
            break;
        case 6:
            desiat_word = "шестьдесят ";
            break;
        case 7:
            desiat_word = "семьдесят ";
            break;
        case 8:
            desiat_word = "восемьдесят ";
            break;
        case 9:
            desiat_word = "девяносто ";
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
