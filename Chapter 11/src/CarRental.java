import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
       try{
           Scanner sc1 = new Scanner(j1.getText());
           double rate = sc1.nextDouble();
           Scanner sc2 = new Scanner(j2.getText());
           int days = sc2.nextInt();
           Scanner sc3 = new Scanner(j3.getText());
           double price = sc3.nextDouble();
           double total = days * price;
           double total2 = total * rate;
           String str = String.format("The total price will be: %.2f\u20AC (%.2fkr)", total, total2);
           message.setText(str);
       } catch(InputMismatchException e1){
           message.setText("Unrecognized symbols, try again");
       } catch(NoSuchElementException e2){
           message.setText("No data, try again");
       }
   }

   public static void main(String[] args){new CarRental();}

}
