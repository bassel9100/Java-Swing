import static javax.swing.JOptionPane.*;

public class Sphere {
    public static void main(String[] args){
        new Sphere().program();
    }

    public void program() {
        double pi = Math.PI;
        while (true) {
            String str = showInputDialog("Enter value for radius");
            if (str == null) {
                showMessageDialog(null, "You cannot leave the field empty");
                str = showInputDialog("Try to enter value for radius again");
            }
            double radius = Double.parseDouble(str);
            if(radius < 0)
                radius = Double.parseDouble(showInputDialog("Radius cannot be negative, try again"));
            str = String.format("The volume is: %.2f \nThe area is: %.2f", (4*pi*radius*radius*radius)/3, 4*radius*radius*pi);
            showMessageDialog(null, str);
        }
    }
}