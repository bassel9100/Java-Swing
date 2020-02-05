import static javax.swing.JOptionPane.*;

public class PrintName {
    public static void main(String[] args){
        while(true) { // This program will loop forever
            showMessageDialog(null, "Well hello " + showInputDialog("Hello there! What is your name?") + "!");
        }
    }
}
