import javax.swing.*;

public class Random {
    public static void main(String[] args){
        String output = "";
        String input = JOptionPane.showInputDialog("How many times do you want to loop?");
        int loop = Integer.parseInt(input);
        for(int i = 0; i < loop; i++){
            for(int j = 0; j <=i; j++)
                output = output + "x";
        output += '\n';
        }
        JOptionPane.showMessageDialog(null, output);
    }
}