import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class colorBox extends JFrame implements ActionListener{

    private JLabel l1 = new JLabel("Swing!", JLabel.CENTER);
    private String[] arr = {"Blue", "Red", "Yellow","Black", "Green"};
    private JComboBox<String> box = new JComboBox<>(arr);

    public colorBox(){
        setLayout(new GridLayout(1,2));
        add(l1); add(box);
        l1.setForeground(Color.BLUE);
        l1.setBackground(Color.WHITE);
        l1.setOpaque(true);
        l1.setPreferredSize(new Dimension(100,100));

        box.setMaximumRowCount(3);
        box.addActionListener(this);
        setSize(200, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(box.getSelectedIndex() == 0)
            l1.setForeground(Color.BLUE);
        else if(box.getSelectedIndex() == 1)
            l1.setForeground(Color.RED);
        else if(box.getSelectedIndex() == 2)
            l1.setForeground(Color.YELLOW);
        else if(box.getSelectedIndex() == 3)
            l1.setForeground(Color.BLACK);
        else if(box.getSelectedIndex() == 4)
            l1.setForeground(Color.GREEN);
    }

    public static void main(String[] args){
        colorBox b1 = new colorBox();
    }
}
