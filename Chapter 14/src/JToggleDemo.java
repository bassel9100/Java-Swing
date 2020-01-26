import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleDemo extends JFrame implements ActionListener {
    private JLabel l  = new JLabel("Swing!", JLabel.CENTER);
    private Font normal = new Font("FONT", Font.PLAIN, 20),
            cursive = new Font("FONT", Font.ITALIC, 20);
    private JRadioButton r1 = new JRadioButton("Blue", true),
            r2 = new JRadioButton("Red", false),
            r3 = new JRadioButton("Yellow", false);
    private JCheckBox x1 = new JCheckBox("Cursive", true),
            x2 = new JCheckBox("Center", true),
            x3 = new JCheckBox("Black Background", false);

    public JToggleDemo() {
        setLayout(new FlowLayout());
        add(l);
        l.setForeground(Color.blue);
        l.setFont(cursive);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBackground(Color.white);
        l.setOpaque(true);
        l.setPreferredSize(new Dimension(150,75));

        JDialog radioButtons = new JDialog(this);
        radioButtons.setLayout(new FlowLayout());
        radioButtons.add(r1); radioButtons.add(r2); radioButtons.add(r3);
        radioButtons.pack();
        radioButtons.setResizable(false);
        ButtonGroup colors = new ButtonGroup();
        colors.add(r1); colors.add(r2); colors.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        add(x1); add(x2); add(x3);
        x1.addActionListener(this);
        x2.addActionListener(this);
        x3.addActionListener(this);
        setSize(450, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        radioButtons.setLocation(0, getHeight());
        radioButtons.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r1)
            l.setForeground(Color.blue);
        else if (e.getSource() == r2)
            l.setForeground(Color.red);
        else if (e.getSource() == r3)
            l.setForeground(Color.yellow);
        else if (e.getSource() == x1)
            if (x1.isSelected())
                l.setFont(cursive);
            else
                l.setFont(normal);
        else if (e.getSource() == x2)
            if (x2.isSelected())
                l.setHorizontalAlignment(JLabel.CENTER);
            else
                l.setHorizontalAlignment(JLabel.LEFT);
        else if (e.getSource() == x3)
            if (x3.isSelected())
                l.setBackground(Color.black);
            else
                l.setBackground(Color.white);
    }

    public static void main (String[] arg) {
        JToggleDemo j = new JToggleDemo();
    }
}