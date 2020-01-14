import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorPicker extends JFrame implements ChangeListener {
    JLabel l1 = new JLabel();
    JSlider r = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
    JSlider g = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
    JSlider b =  new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

    public ColorPicker(){
        setLayout(new GridLayout(4,1));
        add(l1); add(r); add(g); add(b);
        l1.setOpaque(true);
        l1.setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));

        r.setForeground(Color.RED);
        g.setForeground(Color.GREEN);
        b.setForeground(Color.BLUE);

        r.setPaintTicks(true); r.setPaintLabels(true);
        g.setPaintTicks(true); g.setPaintLabels(true);
        b.setPaintTicks(true); b.setPaintLabels(true);

        r.setMajorTickSpacing(50); r.setMinorTickSpacing(5);
        g.setMajorTickSpacing(50); g.setMinorTickSpacing(5);
        b.setMajorTickSpacing(50); b.setMinorTickSpacing(5);

        r.addChangeListener(this);
        g.addChangeListener(this);
        b.addChangeListener(this);

        setSize(400, 225);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void stateChanged(ChangeEvent e){
        l1.setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));
        l1.repaint();
    }

    public static void main(String[] args){
        ColorPicker col = new ColorPicker();
    }
}
