import javax.swing.*;

public class CarInsurance {
    public static void main(String[] args){
        //Variables
        int current_year;
        int car_model_year;
        //Variable Declarations
        current_year = Integer.parseInt(JOptionPane.showInputDialog("What year is it today?"));
        car_model_year = Integer.parseInt(JOptionPane.showInputDialog("What year was the car manufactured?"));
        int r = current_year - car_model_year;
        //Comparing final answer
        if(r < 5)
            JOptionPane.showMessageDialog(null, "You will need a half insurance though the car is new.");
         else if(r > 25)
            JOptionPane.showMessageDialog(null, "You will need a veteran insurance");
         else
            JOptionPane.showMessageDialog(null, "You will need a full insurance");
    }
}