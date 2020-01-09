import javax.swing.*;

public class Birthday {
    public static void main(String[] args){
        String str1 = JOptionPane.showInputDialog("Whats you personal number?");
        String str2 = JOptionPane.showInputDialog("What day is it?");

        if(str1.substring(2,4).equals(str2.substring(5,7)) && str1.substring(4,6).equals(str2.substring(8,10)))
            JOptionPane.showMessageDialog(null, "Congratualtions! It's your birthday today!");
        int x = Character.getNumericValue(str1.charAt(8));
        if(x % 2 == 0)
            JOptionPane.showMessageDialog(null, "You are also a female!");
        else
            JOptionPane.showMessageDialog(null, "You are also a male!");
    }
}