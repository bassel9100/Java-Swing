import javax.swing.*;

public class SGD {

    public static int findsSGD(int x, int y){
        int remainder = x % y;
        while(remainder != 0){
            x = y;
            y = remainder;
            remainder = x % y;
        }
        return y;
    }

    public static void main(String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        JOptionPane.showMessageDialog(null, "The highest common divisor is: " + findsSGD(x,y));
    }
}