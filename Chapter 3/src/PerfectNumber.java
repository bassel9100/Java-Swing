import javax.swing.*;

public class PerfectNumber {

    public static boolean isPerfect(int number){
        if(addFactors(number) == number)
            return true;
        return false;
    }

    public static int addFactors(int number){
        int sum = 0;
        for(int i = number - 1; i > 0; i--){
            if(number % i == 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter you number"));
        if(isPerfect(number))
            JOptionPane.showMessageDialog(null, "The number is perfect!");
        else
            JOptionPane.showMessageDialog(null, "The number is NOT perfect!");
    }

}
