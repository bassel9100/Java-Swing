import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TempConvert extends JFrame implements ChangeListener {
    JSlider cel = new JSlider(JSlider.VERTICAL, -100, 100, 0);
    JSlider fer = new JSlider(JSlider.VERTICAL, -148, 212, 32);

    String grC = "\u00BAC";
    String grF = "\u00BAF";

    JLabel celsius = new JLabel(cel.getValue() + grC, JLabel.CENTER);
    JLabel fahrenheit = new JLabel(fer.getValue() + grF, JLabel.CENTER);

    JPanel p = new JPanel();

    public TempConvert(){
        setLayout(new GridLayout(1,3));
        p.setLayout(new GridLayout(2,1));
        p.add(celsius);
        p.add(fahrenheit);

        add(p); add(cel); add(fer);

        cel.setMajorTickSpacing(10); cel.setMinorTickSpacing(1);
        fer.setMajorTickSpacing(10); fer.setMinorTickSpacing(1);

        cel.addChangeListener(this);
        fer.addChangeListener(this);
        setSize(200,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void stateChanged(ChangeEvent e){
        double c, f;
            if(e.getSource() == cel){
                c = cel.getValue();
                f = c * 9/5+32;
                fer.setValue((int) f);
            } if(e.getSource() == fer){
                f = fer.getValue();
                c = (f-32)*5/9;
                cel.setValue((int) c);
        }
         celsius.setText(cel.getValue() + grC);
         fahrenheit.setText(fer.getValue() + grF);
    }

    public static void main(String[] args){new TempConvert();
    }
}
