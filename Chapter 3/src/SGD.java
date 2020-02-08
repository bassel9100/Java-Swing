import javax.swing.*;
//Find the greatest common divider for two integers x and y
public class SGD {

    public static int findsSGD(int x, int y){
        int r = x % y;
        while(r != 0){
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }

    void program(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        JOptionPane.showMessageDialog(null, "The highest common divisor is: " + findsSGD(x,y));
    }

    public static void main(String[] args){
        new SGD().program();
    }
}