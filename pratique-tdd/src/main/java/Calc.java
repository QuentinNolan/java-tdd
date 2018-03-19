public class Calc {

    String display;
    String firstNumber;
    char operation;
    boolean newNumber;

    Calc() {
        display = "0";
    }

    public void press(char keyStroke) {
        if(display.equals("E")) return;

        if(keyStroke == '+' || keyStroke == '-' ) {
            operation = keyStroke;
            firstNumber = display;
            newNumber = true;
        } else if(keyStroke == '=' ) {
            if(operation == '+') {
                display = "" + (Integer.parseInt(firstNumber) + Integer.parseInt(display));
            } else if (keyStroke == '-') {
                display = "" + (Integer.parseInt(firstNumber) - Integer.parseInt(display));
            }
            if(display.length() >= 9) {
                display = "E";
            }
        } else {
            if(display.length() >= 9 && !newNumber) return;

            if (display.equals("0") || newNumber) {
                display = "" + keyStroke;
                newNumber = false;
            } else {
                display += keyStroke;
            }
        }
    }

    public String display() {
        return display;
    }

}