import javax.swing.*;

public class Reverse_plus_sign {
    public static void main(String[] args){
        String str = ""; //The whole string that we are going to print out
        int x = Integer.parseInt(JOptionPane.showInputDialog("How many time do you want to loop?")); // x is the times we are going to loop

        //The for loop
        for(int i = x; i > 0; i--){
            for(int j = 1; j <= i; j++)
                str += 'x';
            str += '\n';
        }
        JOptionPane.showMessageDialog(null, str);
    }
}
