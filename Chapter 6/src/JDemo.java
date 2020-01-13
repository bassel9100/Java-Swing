import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class JDemo extends JFrame {

    public static void main(String[] args){
        JDemo js = new JDemo();
    }

    public JDemo(){
        setLayout(new GridLayout(1,3));
        getContentPane().setBackground(Color.gray);

        JLabel l1 = new JLabel("Java", JLabel.CENTER);
        l1.setBackground(Color.white);
        l1.setForeground(Color.CYAN);
        l1.setOpaque(true);
        l1.setFont(new Font("SansSerif", Font.BOLD, 24));

        JLabel l2 = new JLabel("med", JLabel.CENTER);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Sansserif", Font.PLAIN, 22));
        l2.setBorder(new EtchedBorder());

        JLabel l3 = new JLabel("Swing!", JLabel.CENTER);
        l3.setBackground(Color.PINK);
        l3.setForeground(Color.GREEN);
        l3.setFont(new Font("WH", Font.ROMAN_BASELINE, 22));
        l3.setToolTipText("First graphical program!");
        l3.setPreferredSize(new Dimension(100,100));
        l3.setOpaque(true);

        add(l1); add(l2); add(l3);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
