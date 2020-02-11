import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Border4 extends JFrame {

    public Border4() {
        LineBorder b1 = new LineBorder(Color.yellow, 5);
        LineBorder b2 = new LineBorder(Color.orange, 5);
        LineBorder b3 = new LineBorder(Color.red, 5);
        LineBorder b4 = new LineBorder(Color.magenta, 5);
        JLabel l = new JLabel("Yall Need To Chill!", JLabel.CENTER);
        l.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(b4, b3), b2), b1));
        add(l);
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] arg) {
        Border4 b = new Border4();
    }
}