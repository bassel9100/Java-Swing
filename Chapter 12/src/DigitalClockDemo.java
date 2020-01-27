import javax.swing.*;
import java.awt.*;

public class DigitalClockDemo extends JFrame {
    private DigitalClock c1 = new DigitalClock();
    private DigitalClock c2 = new DigitalClock("America/New_York");

    public DigitalClockDemo(){
        JLabel l1 = new JLabel("Local Time", JLabel.CENTER);
        JLabel l2 = new JLabel("New York", JLabel.CENTER);

        setLayout(new GridLayout(2,2,5,5));
        add(c1); add(c2); add(l1); add(l2);
        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){ new DigitalClockDemo(); }
}
