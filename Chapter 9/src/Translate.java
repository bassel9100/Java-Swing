import javax.swing.*;
import java.util.*;

public class Translate {
    public static final String[] morse = {".-",    "-...",  "-.-.", "-..",  ".",    "..-.", "--.",   "....",  "..",   ".---", "-.-",  ".-..", "--", "-.",
                             "---",  ".--.", "--.-", ".-.", "...",   "-",    "..-",  "...-", ".--",  "-..-", "-.--",  "--..",  ".--.-",".-.-", "---." };

    public static String toChar(char letter){
        letter = Character.toLowerCase(letter);
        if(letter <= 'z' && letter >= 'a')
            return morse[(int) letter - 'a'];
        else if(letter == 'å')
            return morse[morse.length - 3];
        else if(letter == 'ä')
            return morse[morse.length - 2];
        else if(letter == 'ö')
            return morse[morse.length - 1];
        else if(letter == ' ')
            return " ";
        else
            return "";
    }

    public static void main (String[] args){
        String str = JOptionPane.showInputDialog("Enter a sentence to translate into morse code");
        String morse = "";
        Scanner sc = new Scanner(str);
        for(int i = 0; i < str.length(); i++)
            morse += toChar(str.charAt(i));
        JOptionPane.showMessageDialog(null, "Translation:'\n" + morse);
    }
}
