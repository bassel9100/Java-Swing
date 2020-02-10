import static javax.swing.JOptionPane.*;
import java.util.*;

public class CaRental2 {
    public static void main(String[] args){
        String str = showInputDialog("Enter total amount of days, price per day and car brand");
        int days = 0;
        double price = 0;
        String brand = "";
        boolean done = false;
        while(!done){
            Scanner sc = new Scanner(str);
            String error = "";
            try{
                days = sc.nextInt();
                price = sc.nextDouble();
                brand = sc.next();
                done = true;
            } catch(InputMismatchException e) {
                error = "Uncorrect values, try again";
            } catch(NoSuchElementException e){
                error = "Field cannot be empty, try again";
            }
            if(!done)
                str = showInputDialog(error + "\nEnter total amount of days, price per day and car brand");
        }
        String answer = String.format("The total price for the %s will be %.2f", brand, days*price);
        showMessageDialog(null, answer);
        System.exit(0);
    }
}