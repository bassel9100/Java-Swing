import javax.swing.*;

public class Sphere {
    public static void main(String[] args){
        double r;
        double volume, area;

        r = Double.parseDouble(JOptionPane.showInputDialog("Enter radius value"));
        volume = (4*Math.PI*r*r*r)/3;
        area = 4*Math.PI*r*r;

        JOptionPane.showMessageDialog(null, "The Volume of the Sphere is: " + volume + '\n' + "The Area of the Sphere is: " + area);
    }
}