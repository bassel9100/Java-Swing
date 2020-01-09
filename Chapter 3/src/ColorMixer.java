import javax.swing.*;

public class ColorMixer {
    public enum Color {RED, GREEN, BLUE, PURPLE, YELLOW, CYAN, ORANGE, PINK, BLACK, WHITE, GREY, BROWN}

    public static void main(String[] args){
        while(true){
            String str1 = JOptionPane.showInputDialog("Enter first main color");
            if(str1 == null)
                break;
            String str2 = JOptionPane.showInputDialog("Enter second main color");
            if(str2 == null)
                break;
            Color c1 = Enum.valueOf(Color.class, str1.toUpperCase());
            Color c2 = Enum.valueOf(Color.class, str2.toUpperCase());

            if(c1.compareTo(Color.BLUE) > 0 || c2.compareTo(Color.BLUE) > 0)
                JOptionPane.showMessageDialog(null, "Not a main color! Try again");
            else {
                Color c3;
                if(c1 == Color.RED && c2 == Color.GREEN || c1 == Color.GREEN && c2 == Color.RED)
                    c3 = Color.YELLOW;
                else if(c1 == Color.RED && c2 == Color.BLUE || c1 == Color.BLUE && c2 == Color.RED)
                    c3 = Color.PURPLE;
                else if(c1 == Color.BLUE && c2 == Color.GREEN || c1 == Color.GREEN && c2 == Color.BLUE)
                    c3 = Color.CYAN;
                else
                    c3 = c1;
                JOptionPane.showMessageDialog(null, "The mixed color is " + c3.toString().toLowerCase());
            }
        }
    }
}