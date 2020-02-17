import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class PicDemo extends JFrame implements ActionListener {
    private JLabel l1 = new JLabel();
    private JTextField t = new JTextField();

    public PicDemo(){
        setLayout(new BorderLayout());
        add(l1, BorderLayout.CENTER);
        add(t, BorderLayout.SOUTH);
        l1.setHorizontalAlignment(JLabel.CENTER);
        t.addActionListener(this);
        getContentPane().setBackground(Color.lightGray);
        setSize(450,230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        l1.setIcon(null);
        try{
            URL u = new URL(t.getText());
            ImageIcon picture = new ImageIcon(u);
            l1.setIcon(picture);
        } catch (MalformedURLException ue){
            setTitle("Wrong URL");
        }
    }

    public static void main(String[] args){
        new PicDemo();
    }
}
