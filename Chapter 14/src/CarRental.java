import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CarRental extends JFrame implements ActionListener {
    private JTextField exchange = new JTextField(15);
    private JTextField dayPrice  = new JTextField(15);
    private JTextField price = new JTextField(15);
    private JLabel l1 = new JLabel("Exchange? ", JLabel.RIGHT);
    private JLabel l2 = new JLabel("How many days? ",  JLabel.RIGHT);
    private JLabel l3 = new JLabel("Price Per Day? ", JLabel.RIGHT);
    private JPanel p = new JPanel();
    private JLabel result = new JLabel();
    private JPanel p2 = new JPanel();
    private JButton newCount = new JButton("New Count");
    static int windowNr = 0;

    public CarRental() {
        setLayout(new GridLayout(3,1));
        add(p);
        add(result);
        p.setLayout(new GridLayout(3,2));
        p.add(l1); p.add(exchange);
        p.add(l2); p.add(dayPrice);
        p.add(l3); p.add(price);
        add(p2);
        p2.setLayout(new FlowLayout());
        p2.add(newCount);

        l1.setLabelFor(exchange); l1.setDisplayedMnemonic('V');
        l2.setLabelFor(dayPrice);  l2.setDisplayedMnemonic('A');
        l3.setLabelFor(price); l3.setDisplayedMnemonic('P');
        result.setHorizontalAlignment(JLabel.CENTER);
        pack();
        dayPrice.addActionListener(this);
        price.addActionListener(this);
        exchange.addActionListener(this);
        newCount.addActionListener(this);

        setLocation(50*windowNr, 50*windowNr); //Change window location each time we create a new JFrame
        windowNr++;
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==dayPrice|| e.getSource()==dayPrice ||
                e.getSource()==price) {
            Scanner sc1 = new Scanner(dayPrice.getText());
            double kurs = sc1.nextDouble();
            Scanner sc2 = new Scanner(dayPrice.getText());
            int antalDagar = sc2.nextInt();
            Scanner sc3 = new Scanner(price.getText());
            double dagspris = sc3.nextDouble();
            double totPris = antalDagar * dagspris;
            String s = String.format("Total price: %.2f\u20AC (%.2fkr)",
                    totPris, totPris*kurs);
            result.setText(s);
        }
        else if (e.getSource()==newCount)
            new CarRental();
    }

    public static void main (String[] arg) {
        CarRental bil = new CarRental();
    }
}
