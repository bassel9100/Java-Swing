import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CircleDemo extends JFrame {

    public CircleDemo(){
        Circle c1 = new Circle();
        Circle c2 = new Circle(-50, 50);
        Circle c3 = new Circle(-100, 100);
        c1.setValue(90);
        c2.setValue(0);
        c3.setValue(35);
        c1.setBorder(new LineBorder(Color.BLACK));
        c2.setBorder(new LineBorder(Color.BLACK));
        c3.setBorder(new LineBorder(Color.BLACK));
        setLayout(new GridLayout(1,3));
        add(c1); add(c2); add(c3);
        setSize(300,120);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new CircleDemo();
    }
}
