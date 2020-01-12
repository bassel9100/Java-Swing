import java.util.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args){
        while(true){
            String str = JOptionPane.showInputDialog("Enter equation");
            if(str == null)
                break;
            Scanner sc = new Scanner(str);
            int a = sc.nextInt();
            String x = sc.next();
            int b = sc.nextInt();
            double sum = 0;
            boolean done = true;
            try {
                if (x.equals("+"))
                    sum = a + b;
                else if (x.equals("-"))
                    sum = a - b;
                else if (x.equals("*"))
                    sum = a * b;
                else if (x.equals("/"))
                    sum = a / b;
                else
                    done = false;
            } catch(InputMismatchException e){
                done = false;
            }
            catch(NoSuchElementException e){
                done = false;
            }
            if(done)
                JOptionPane.showMessageDialog(null, "The answer is: " + sum);
            else
                JOptionPane.showMessageDialog(null, "Wrong input try again");
        }
    }
}
