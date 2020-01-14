import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BilHyra extends JFrame implements ActionListener {

    private JLabel l1 = new JLabel("Växlingkurs?", JLabel.RIGHT);
    private JLabel l2 = new JLabel("Antal Dagar?", JLabel.RIGHT);
    private JLabel l3 = new JLabel("Pris Per Dag?", JLabel.RIGHT);
    private JLabel l4 = new JLabel("", JLabel.CENTER);

    private JTextField t1 = new JTextField(15);
    private JTextField t2 = new JTextField(15);
    private JTextField t3 = new JTextField(15);

    private JPanel p = new JPanel();

    public static void main(String[] args){
        BilHyra demo = new BilHyra();
    }

    public BilHyra(){
        setLayout(new GridLayout(2,1));
        add(p); add(l4);

        p.setLayout(new GridLayout(3,2));
        p.add(l1); p.add(t1);
        p.add(l2); p.add(t2);
        p.add(l3); p.add(t3);

        l1.setLabelFor(t1); l1.setDisplayedMnemonic('V');
        l2.setLabelFor(t2); l2.setDisplayedMnemonic('A');
        l3.setLabelFor(t3); l3.setDisplayedMnemonic('P');

        pack();

        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        Scanner sc1 = new Scanner(t1.getText());
        double kurs = sc1.nextDouble();

        Scanner sc2 = new Scanner(t2.getText());
        int dagar = sc2.nextInt();

        Scanner sc3 = new Scanner(t3.getText());
        double pris = sc3.nextDouble();

        double totPris = dagar*pris;
        double sek = totPris*kurs;

        String str = String.format("Totalt pris: %.2f\u20AC (%.2fkr)", totPris, sek);

        l4.setText(str);
    }
}
