import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    JLabel l1 = new JLabel("Java", JLabel.CENTER);
    Font small = new Font("Small", Font.PLAIN, 10);
    Font medium = new Font("Medium", Font.PLAIN, 20);
    Font large = new Font("Large", Font.PLAIN, 30);

    JMenuBar mb = new JMenuBar();
    JMenu menu = new JMenu("Settings");
    JMenuItem smallM = new JMenuItem("Small Text");
    JMenuItem mediumM = new JMenuItem("Medium Text");
    JMenuItem largeM = new JMenuItem("Large Text");

    JCheckBoxMenuItem backCol = new JCheckBoxMenuItem("White Background", true);

    JRadioButtonMenuItem left = new JRadioButtonMenuItem("Left", false);
    JRadioButtonMenuItem center = new JRadioButtonMenuItem("Center", true);
    JRadioButtonMenuItem right = new JRadioButtonMenuItem("Right", false);

    JMenuItem quit = new JMenuItem("Quit");

    public Menu(){
        add(l1, BorderLayout.CENTER);
        l1.setFont(medium);
        l1.setBackground(Color.white);
        l1.setOpaque(true);

        setJMenuBar(mb);
        mb.add(menu);
        menu.add(smallM); menu.add(mediumM); menu.add(largeM);
        menu.add(backCol);
        menu.add(left); menu.add(center); menu.add(right);
        menu.addSeparator();
        menu.add(quit);

        ButtonGroup g = new ButtonGroup();
        g.add(left); g.add(center); g.add(right);

        smallM.addActionListener(this);
        mediumM.addActionListener(this);
        largeM.addActionListener(this);
        backCol.addActionListener(this);
        left.addActionListener(this);
        center.addActionListener(this);
        right.addActionListener(this);
        quit.addActionListener(this);

        setTitle("Menu Demo");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        Object x = e.getSource();
        if(x == smallM)
            l1.setFont(small);
        else if(x == mediumM)
            l1.setFont(medium);
        else if(x == largeM)
            l1.setFont(large);
        else if(x == backCol)
            if(backCol.isSelected())
                l1.setBackground(Color.white);
            else
                l1.setBackground(Color.lightGray);
        else if(x == left)
            l1.setHorizontalAlignment(JLabel.LEFT);
        else if(x == center)
            l1.setHorizontalAlignment(JLabel.CENTER);
        else if(x == right)
            l1.setHorizontalAlignment(JLabel.RIGHT);
        else if(x == quit)
            System.exit(0);
    }

    public static void main(String[] args){new Menu();}


}
