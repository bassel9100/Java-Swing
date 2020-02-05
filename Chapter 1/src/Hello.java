import java.awt.*;
import javax.swing.*;

public class Hello extends JFrame{

    public Hello(){
        getContentPane().setBackground(Color.lightGray);
        add(new JLabel("Welcome to Java!", JLabel.CENTER));
        setSize(300,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Hello();
    }
}
