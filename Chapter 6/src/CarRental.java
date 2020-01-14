import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CarRental extends JFrame implements ActionListener {
    private JTextField currentMileage   = new JTextField(10);
    private JTextField lastYearsMileage = new JTextField(10);
    private JTextField gas              = new JTextField(10);

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    private JLabel drivenMileage = new JLabel(" ", JLabel.CENTER);
    private JLabel gasLitres = new JLabel(" ", JLabel.CENTER);
    private JLabel gasPerMile = new JLabel(" ",JLabel.CENTER);

    public CarRental(){
        getContentPane().setBackground(Color.LIGHT_GRAY);

        p1.setLayout(new GridLayout(3,1));
        p1.add(new JLabel("Current Mileage: ", JLabel.RIGHT));
        p1.add(new JLabel("Last Years Mileage: ", JLabel.RIGHT));
        p1.add(new JLabel("Used Gas Per Year: ", JLabel.RIGHT));

        p2.setLayout(new GridLayout(3,1));
        p2.add(currentMileage);
        p2.add(lastYearsMileage);
        p2.add(gas);

        p3.setLayout(new GridLayout(3,1));
        p3.add(drivenMileage);
        p3.add(gasLitres);
        p3.add(gasPerMile);

        setLayout(new BorderLayout());
        add("West",   p1);
        add("Center", p2);
        add("South", p3);

        currentMileage.addActionListener(this);
        lastYearsMileage.addActionListener(this);
        gas.addActionListener(this);

        pack();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == currentMileage || e.getSource() == lastYearsMileage || e.getSource() == gas){
            Scanner sc1 = new Scanner(currentMileage.getText());
            double currentMileageS = sc1.nextDouble();

            Scanner sc2 = new Scanner(currentMileage.getText());
            double lastYearsMileageS = sc2.nextDouble();

            Scanner sc3 = new Scanner(currentMileage.getText());
            double gasS = sc3.nextDouble();

            drivenMileage.setText(String.format("Total driven miles %.2f", currentMileageS-lastYearsMileageS));
            gasLitres.setText(String.format("Total litres gas %.2f", gasS));
            gasPerMile.setText(String.format("Total usage per mile %.2f", (currentMileageS-lastYearsMileageS)/gasS));
        }
    }

    public static void main(String[] arga){
        CarRental c = new CarRental();
    }
}
