import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Fahrenheit2Celsius extends JFrame implements ChangeListener {
    private JSlider celsius = new JSlider(JSlider.VERTICAL,-100,100,0);
    private JSlider fahrenheit = new JSlider(JSlider.VERTICAL, -150, 220, 32);

    String grC = "\u00BAC";
    String grF = "\u00BAF";

    JLabel celsiusL = new JLabel(celsius.getValue() + grC, JLabel.CENTER);
    JLabel fahrenheitL = new JLabel(fahrenheit.getValue() + grF, JLabel.CENTER);

    public Fahrenheit2Celsius(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,1));
        p.add(celsiusL); p.add(fahrenheitL);
        setLayout(new GridLayout(1,3));
        add(p); add(celsius); add(fahrenheit);
        getContentPane().setBackground(Color.lightGray);
        celsius.setMajorTickSpacing(1);
        fahrenheit.setMajorTickSpacing(1);
        celsius.addChangeListener(this);
        fahrenheit.addChangeListener(this);
        setSize(140,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void stateChanged(ChangeEvent e){
        double c, f = 0;
        if(e.getSource() == celsius){
            c = celsius.getValue();
            f = c * 9/5+32;
            fahrenheit.setValue((int) f);
        }
        if(e.getSource() == fahrenheit){
            f = fahrenheit.getValue();
            c = (f-32)*5/9;
            celsius.setValue((int) c);
        }
        celsiusL.setText(celsius.getValue() + grC);
        fahrenheitL.setText(fahrenheit.getValue() + grF);
    }

    public static void main(String[] args){
        new Fahrenheit2Celsius();
    }
}
