import static javax.swing.JOptionPane.*;

public class Palindrom {

    protected static boolean isPalindrom(String str){
        int firstLetter = 0;
        int lastLetter = str.length()-1;
        System.out.print(str.length());
        while(firstLetter <= lastLetter){
            if(str.charAt(firstLetter) != str.charAt(lastLetter))
                return false;
            firstLetter++;
            lastLetter--;
        }
        return true;
    }

    void program(){
        String word = showInputDialog("Enter a random word to check if its a Palindrome");
        if(isPalindrom(word))
            showMessageDialog(null, "The word " + word + " is a Palindrome!");
        else
            showMessageDialog(null, "The word " + word + " NOT is a Palindrome!");
    }

    public static void main(String[] args){
        new Palindrom().program();
    }
}