public class Calc {

    String display;

    Calc() {
        display = "0";
    }

    public void press(char keyStroke) {
        if(display.length()==9) return;

        if(display.equals("0")){
            display = "" + keyStroke;
        } else {
            display += keyStroke;
        }
    }

    public String display() {
        return display;
    }

}