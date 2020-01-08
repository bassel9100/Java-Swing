import javax.swing.*;

public class SwimPoints {
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int result = 0;
        int final_result;
        int difficulty;

        difficulty = Integer.parseInt(JOptionPane.showInputDialog("Please enter difficulty level"));

        for(int i = 1; i <= 7; i++){
            String str = JOptionPane.showInputDialog("Enter point for judge nr: " + i);
            result = result + Integer.parseInt(str);
            if(result > max) {
                max = result;
            }
            if(result < min) {
                min = result;
            }
        }

        result = result - max - min;
        System.out.println(min + " " + max + " " + result);
        final_result = result/(5*3*difficulty);
        JOptionPane.showMessageDialog(null, "The final point is " + final_result);
    }
}
