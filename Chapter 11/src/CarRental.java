import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarRental extends JFrame implements ActionListener {

   private JTextField j1 = new JTextField(5);
   private JTextField j2 = new JTextField(5);
   private JTextField j3 = new JTextField(5);

   private JPanel p1 = new JPanel();
   private JPanel p2 = new JPanel();
   private JPanel p = new JPanel();

   private JLabel message = new JLabel(" Hello ", JLabel.CENTER);

   public CarRental(){
       setLayout(new GridLayout(2,1));
       getContentPane().setBackground(Color.lightGray);

       p1.setLayout(new GridLayout(3,1));
       p1.add(new JLabel("Exchange Rate:", JLabel.RIGHT));
       p1.add(new JLabel("Rental Days:", JLabel.RIGHT));
       p1.add(new JLabel("Price per day:", JLabel.RIGHT));

       p2.setLayout(new GridLayout(3,1));
       p2.add(j1); p2.add(j2); p2.add(j3);

       p.setLayout(new GridLayout(1,2));
       p.add(p1); p.add(p2);

       add(p);
       add(message);

       j1.addActionListener(this);
       j2.addActionListener(this);
       j3.addActionListener(this);

        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public void actionPerformed(ActionEvent e){

   }

   public static void main(String[] args){new CarRental();}

}
