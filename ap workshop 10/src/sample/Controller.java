package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyEvent;

import java.text.DecimalFormat;
import java.util.Formatter;


public class Controller {
    @FXML
    private TextArea textArea;
    private double x;
    private double y;
    private String command = null;
    private boolean flag = false;
    public void press0(){
        textArea.setText("0");
        if (!flag){
            x = 0;
            flag = true;
        }
        else{
            y = 0;
            flag = false;
        }
    }
    public void press1(){
        textArea.setText("1");
        if (!flag){
            x = 1;
            flag = true;
        }
        else{
            y = 1;
            flag = false;
        }
    }
    public void press2(){
        textArea.setText("2");
        if (!flag){
            x = 2;
            flag = true;
        }
        else{
            y = 2;
            flag = false;
        }
    }
    public void press3(){
        textArea.setText("3");
        if (!flag){
            x = 3;
            flag = true;
        }
        else{
            y = 3;
            flag = false;
        }
    }
    public void press4(){
        textArea.setText("4");
        if (!flag){
            x = 4;
            flag = true;
        }
        else{
            y = 4;
            flag = false;
        }
    }
    public void press5(){
        textArea.setText("5");
        if (!flag){
            x = 5;
            flag = true;
        }
        else{
            y = 5;
            flag = false;
        }
    }
    public void press6(){
        textArea.setText("6");
        if (!flag){
            x = 6;
            flag = true;
        }
        else{
            y = 6;
            flag = false;
        }
    }
    public void press7(){
        textArea.setText("7");
        if (!flag){
            x = 7;
            flag = true;
        }
        else{
            y = 7;
            flag = false;
        }
    }
    public void press8(){
        textArea.setText("8");
        if (!flag){
            x = 8;
            flag = true;
        }
        else{
            y = 8;
            flag = false;
        }
    }
    public void press9(){
        textArea.setText("9");
        if (!flag){
            x = 9;
            flag = true;
        }
        else{
            y = 9;
            flag = false;
        }
    }
    public void pressPi(){
        textArea.setText("3.14");
        if (!flag){
            x = 3.14;
            flag = true;
        }
        else{
            y = 3.14;
            flag = false;
        }
    }
    public void pressEulerNumber(){
        textArea.setText("2.71");
        if (!flag){
            x = 2.71;
            flag = true;
        }
        else{
            y = 2.71;
            flag = false;
        }
    }
    public void pressSum(){
        command = "+";
    }
    public void pressSubtract(){
        command = "-";
    }
    public void pressDivide(){
        command = "/";
    }
    public void pressProduct(){
        command = "*";
    }
    public void changeSign(){
        if (flag == true) {
            x *= -1;
            textArea.setText("" + x);
        }
        else {
            y *= -1;
            textArea.setText("" + y);
        }
    }
    public void radical(){
        if (flag == true) {
            x = Math.pow(x, 0.5);
            textArea.setText("" + x);
        }
        else {
            y = Math.pow(y, 0.5);
            textArea.setText("" + y);
        }
    }
    public void pressEqual(){
        if (command.equals("+")) {
            double fraction = (x + y) - (int) (x + y);
            String finalResult = null;
            if (fraction == 0)
                finalResult = String.valueOf((int) (x + y));
            else
                finalResult = String.valueOf((x + y));
            textArea.setText(finalResult);
        }
        else if (command.equals("-")) {
            double fraction = (x - y) - (int) (x - y);
            String finalResult = null;
            if (fraction == 0)
                finalResult = String.valueOf((int) (x - y));
            else
                finalResult = String.valueOf((x - y));
            textArea.setText(finalResult);
        }
        else if (command.equals("*")) {
            double fraction = (x * y) - (int) (x * y);
            String finalResult = null;
            if (fraction == 0)
                finalResult = String.valueOf((int) (x * y));
            else
                finalResult = String.valueOf((x * y));
            textArea.setText(finalResult);
        }
        else if (command.equals("/")) {
            double fraction = (x / y) - (int) (x / y);
            String finalResult = null;
            if (fraction == 0)
                finalResult = String.valueOf((int) (x / y));
            else
                finalResult = String.valueOf((x / y));
            textArea.setText(finalResult);
        }
    }
}
