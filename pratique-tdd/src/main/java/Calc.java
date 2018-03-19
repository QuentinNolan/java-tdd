public class Calc {

    String display;
    String firstNumber;
    String operationNumber;
    char operation;
    boolean newNumber;

    Calc() {
        display = "0";
    }

    public void press(char keyStroke) {
        if(keyStroke == 'C') {
            display = "0";
            newNumber = false;
        } else if(!display.equals("E")) {
            if (keyStroke == '+' || keyStroke == '-') {
                operation = keyStroke;
                firstNumber = display;
                newNumber = true;
                operationNumber = "";
            } else if (keyStroke == '=') {
                //String newFirstNumber = display;
                if(operationNumber.length() == 0) {
                    operationNumber = display;
                }

                if (operation == '+') {
                    display = "" + (Integer.parseInt(firstNumber) + Integer.parseInt(operationNumber));
                } else if (operation == '-') {
                    display = "" + (Integer.parseInt(firstNumber) - Integer.parseInt(operationNumber));
                }

                firstNumber = display;

                if (display.length() >= 9) {
                    display = "E";
                }
            } else {
                if (display.length() >= 9 && !newNumber) return;

                if (display.equals("0") || newNumber) {
                    display = "" + keyStroke;
                    newNumber = false;
                } else {
                    display += keyStroke;
                }
            }
        }
    }

    public String display() {
        return display;
    }

}