import java.util.*;
import javax.swing.*;

public class carRent {
    public static void main(String[] args){
        int days;
        double pricePerDay;
        String carName;
        while(true){
            String str = JOptionPane.showInputDialog("Enter days, price perDay and car model");
            if(str == null){
                JOptionPane.showMessageDialog(null, "No input try again");
                break;
            }
            Scanner sc = new Scanner(str);
            try{
                 days = sc.nextInt();
                 pricePerDay = sc.nextDouble();
                 carName = sc.next();
                JOptionPane.showMessageDialog(null, "Total price for renting the " + carName + " is: " + (days*pricePerDay));
            } catch(InputMismatchException e){
                JOptionPane.showMessageDialog(null, "Wrong type format try agian");
            } catch(NoSuchElementException e){
                JOptionPane.showMessageDialog(null, "No input try again");
            }
        }
    }
}
