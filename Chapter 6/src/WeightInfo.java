import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class WeightInfo extends JFrame implements ActionListener {
    private JLabel info =   new JLabel("", JLabel.CENTER);

    private JTextField nameT =  new JTextField(10);
    private JTextField weightT =   new JTextField(10);
    private JTextField lengthT = new JTextField(10);

    private JPanel p = new JPanel();

    public WeightInfo(){
        setLayout(new GridLayout(2,1));
        getContentPane().setBackground(Color.lightGray);
        p.setLayout(new GridLayout(3,2));
        add(p); add(info);

        p.add(new JLabel("Enter Name", JLabel.RIGHT));      p.add(nameT);
        p.add(new JLabel("Enter weight", JLabel.RIGHT));    p.add(weightT);
        p.add(new JLabel("Enter Length", JLabel.RIGHT));    p.add(lengthT);

        weightT.addActionListener(this);
        nameT.addActionListener(this);
        lengthT.addActionListener(this);

        pack();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == nameT || e.getSource() == weightT || e.getSource() == lengthT) {
            String nameS = nameT.getText();
            int weightS = Integer.parseInt(weightT.getText());
            Scanner sc3 = new Scanner(lengthT.getText());
            double lengthS = sc3.nextDouble();
            String str = String.format("Hello %s! You weigh %.2f kg/cm", nameS, weightS / lengthS);
            info.setText(str);
        }
    }

    public static void main(String[] args){
        WeightInfo w = new WeightInfo();
    }
}
