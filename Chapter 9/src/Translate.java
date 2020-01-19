import javax.swing.*;
import java.text.Collator;
import java.util.*;

public class Translate {
    public static final String[] morse = {".-", "-...",  "-.-.", "-..",  ".",    "..-.", "--.",   "....",  "..",   ".---", "-.-",  ".-..", "--", "-.",
                             "---",  ".--.", "--.-", ".-.", "...",   "-",    "..-",  "...-", ".--",  "-..-", "-.--",  "--..",  ".--.-",".-.-", "---." };

    public static String toMorse(char letter){
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

    public static char toLetter(String x){
        int j = 0;
        for(; j < morse.length && !x.equals(morse[j]); j++)
            ;
        if(j < morse.length-3)
            return (char) ((int)'a' + j);
        else if(j == morse.length-3)
            return 'å';
        else if(j == morse.length-2)
            return 'ä';
        else if(j == morse.length-1)
            return 'ö';
        else
            return '?';
    }

    public static void main (String[] args){
        String str = JOptionPane.showInputDialog("Enter a sentence to translate into morse code");
        String morse = "";
        Scanner sc = new Scanner(str);
        for(int i = 0; i < str.length(); i++)
            morse += toMorse(str.charAt(i));
        JOptionPane.showMessageDialog(null, "Translation:'\n" + morse);

        morse = ".- .- .- .- ---.  .-";
        while(morse.length() > 0){
            int k = morse.indexOf(' ');
            if(k >= 0){
                System.out.println(toLetter(morse.substring(0, k)));
                if(morse.charAt(k+1) == ' ') {
                    System.out.println(' ');
                    morse = morse.substring(k + 2);
                } else
                    morse = morse.substring(k+1);
            } else {
                System.out.println(toLetter(morse));
                morse = "";
            }
        }
    }
}
