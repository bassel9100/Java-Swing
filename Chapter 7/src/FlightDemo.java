import java.awt.*;
import javax.swing.*;

public class FlightDemo extends JFrame {
    private Flight f1, f2, f3, f4;

    private FlightDemo(){
         f1 = new Flight("BA1853", "London", 8, 10, 13, 50);
         f2 = new Flight("AF3142", "Berlin", 9, 30, 22, 40);
         f3 = new Flight("ZX9381", "Tokyo", 13, 30, 23, 30);
         f4 = new Flight("BA3813", "Los Angeles", 14, 00, 17, 00);
        setLayout(new GridLayout(4,1,0,1));
        add(f1); add(f2); add(f3); add(f4);
        getContentPane().setBackground(Color.BLACK);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        f2.delay(50);
        f2.setForeground(Color.red);
    }

    public static void main(String[] args){
        new FlightDemo();
    }
}
