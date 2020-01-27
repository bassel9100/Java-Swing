import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RedButton extends JFrame {
    JButton b = new JButton("STOP");

    public RedButton() {
        setLayout(new FlowLayout());
        add(b);
        b.addMouseListener(l);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    MouseListener l = new MouseAdapter() {
        public void mouseEntered(MouseEvent e){
            if(e.getComponent() == b)
                b.setBackground(Color.RED);
        }

        public void mouseExited(MouseEvent e) {
            if (e.getComponent() == b)
                b.setBackground(Color.lightGray);
        }
    };

    public static void main(String args[]) { new RedButton(); }

}
