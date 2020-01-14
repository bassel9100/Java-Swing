import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hello extends JFrame implements ActionListener{

    JComboBox<String> box = new JComboBox<>();
    JLabel l1 = new JLabel("", JLabel.CENTER);

    public Hello(){
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.gray);

        add(new JLabel("What's your name?"),JLabel.CENTER);
        add(box);
        add(l1);

        box.setEditable(true);
        box.setMaximumRowCount(3);
        box.addActionListener(this);

        setSize(new Dimension(350,100));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String name = (String) box.getSelectedItem();
        l1.setText("Hello " + name + " !");
        if(box.getSelectedIndex() == -1)
            box.addItem(name);
    }

    public static void main(String[] argas){
        Hello hi = new Hello();
    }
}
