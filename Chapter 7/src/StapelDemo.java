import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class StapelDemo extends JFrame{

    public StapelDemo(){
        Stapel s1 = new Stapel(true);
        Stapel s2 = new Stapel(true);
        Stapel s3 = new Stapel(true);
        s1.setPercent(30); s1.setBorder(new LineBorder(Color.LIGHT_GRAY));
        s2.setPercent(75); s2.setBorder(new LineBorder(Color.LIGHT_GRAY));
        s3.setPercent(95); s3.setBorder(new LineBorder(Color.LIGHT_GRAY));
        s1.setForeground(Color.RED); s1.setBackground(Color.BLACK);
        s2.setForeground(Color.RED); s2.setBackground(Color.BLACK);
        s3.setForeground(Color.RED); s3.setBackground(Color.BLACK);
        setLayout(new GridLayout(1,3));
        add(s1); add(s2); add(s3);
        setSize(70,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new StapelDemo();
    }
}