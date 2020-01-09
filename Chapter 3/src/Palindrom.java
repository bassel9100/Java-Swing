import javax.swing.*;

public class Palindrom {

    public static boolean isPalindrom(String str){
        int x = str.length();
        int j, i;
        for(i = 0, j = x-1; i < j; i++, j--){
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        String word = JOptionPane.showInputDialog("Enter a word");
        if(isPalindrom(word.toLowerCase()))
            JOptionPane.showMessageDialog(null, "It's a palindrome!");
        else
            JOptionPane.showMessageDialog(null, "It's NOT a palindrome!");

    }
}
