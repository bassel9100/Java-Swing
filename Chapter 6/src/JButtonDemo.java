import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonDemo extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Welcome!", JLabel.CENTER);
    JButton b1 = new JButton("Cancel");
    JButton b2 = new JButton("In, English Please!");
    JButton b3 = new JButton("På svenska, tack!");

    public static void main(String[] args){
        JButtonDemo demo = new JButtonDemo();
    }

    public JButtonDemo(){
        setLayout(new GridLayout(2,2));
        getContentPane().setBackground(Color.gray);

        l1.setFont(new Font("SS", Font.ITALIC, 22));
        b1.setFont(new Font("SS", Font.BOLD, 14));

        add(l1); add(b1); add(b2); add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        b2.setEnabled(false);

        setSize(350,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        Object b = e.getSource();
        if(b == b1)
            System.exit(0);
        else if(b == b2){
            l1.setText("Welcome!");
            b1.setText("Cancel");
            b2.setEnabled(false);
            b3.setEnabled(true);
        } else if(b == b3){
            l1.setText("Välkommen!");
            b1.setText("Avsluta");
            b2.setEnabled(true);
            b3.setEnabled(false);
        }
    }
}