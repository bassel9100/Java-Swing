import javax.swing.*;

public class Sphere {
    public static void main(String[] args){
        double r;
        double volume, area;
        while(true) {
            r = Double.parseDouble(JOptionPane.showInputDialog("Enter radius value"));
            if(r < 0){
                r = Double.parseDouble(JOptionPane.showInputDialog("Radius cannot be negative. Enter value greater than 0"));
            }
            volume = (4 * Math.PI * r * r * r) / 3;
            area = 4 * Math.PI * r * r;

            JOptionPane.showMessageDialog(null, "The Volume of the Sphere is: " + volume + '\n' + "The Area of the Sphere is: " + area);
        }
    }
}