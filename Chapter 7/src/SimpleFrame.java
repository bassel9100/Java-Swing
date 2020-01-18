import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFrame extends JFrame implements ActionListener {
    private JButton close = new JButton("X");

    public SimpleFrame() {
        setUndecorated(true);
        Container c = (Container) getContentPane();
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout(FlowLayout.RIGHT));
        top.add(close);
        close.setBackground(Color.lightGray);
        c.add(top, BorderLayout.NORTH);
        JLabel l = new JLabel("Close with button", JLabel.CENTER);
        c.add(l, BorderLayout.CENTER);
        close.addActionListener(this);
        setOpacity(0.5f);
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == close)
            System.exit(0);
    }

    public static void main (String[] arg) {
        SimpleFrame f = new SimpleFrame();
    }
}