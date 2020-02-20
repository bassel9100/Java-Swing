import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RPS2 extends JFrame implements ActionListener {
    private JButton rockA = new JButton("Rock");
    private JButton paperA = new JButton("Paper");
    private JButton scissorA = new JButton("Scissor");

    private JButton rockC = new JButton("Rock");
    private JButton paperC = new JButton("Paper");
    private JButton scissorC = new JButton("Scissor");

    private JLabel result = new JLabel("Welcome!", JLabel.CENTER);
    private JLabel score = new JLabel("", JLabel.CENTER);
    private JLabel message = new JLabel("", JLabel.CENTER);

    int scoreN = 0;
    int scoreA = 0;

    public RPS2(){
        JPanel pA = new JPanel();
        pA.setLayout(new GridLayout(3,1));
        pA.add(rockA); pA.add(paperA); pA.add(scissorA);

        JPanel pC = new JPanel();
        pC.setLayout(new GridLayout(3,1));
        pC.add(rockC); pC.add(paperC); pC.add(scissorC);

        JPanel middle = new JPanel();
        middle.setLayout(new GridLayout(3,1));
        middle.add(result); middle.add(score); middle.add(message);

        setLayout(new GridLayout(1,3));
        getContentPane().setBackground(Color.lightGray);
        add(pA); add(middle); add(pC);

        rockA.addActionListener(this);
        paperA.addActionListener(this);
        scissorA.addActionListener(this);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        int choiceA = 0;
        int choiceC;
        final int ROCK = 1, PAPER = 2, SCISSOR = 3;

        if(e.getSource() == rockA){
            choiceA = 1;
            rockA.setForeground(Color.BLUE);
            paperA.setForeground(Color.BLACK);
            scissorA.setForeground(Color.BLACK);
        }
        if(e.getSource() == paperA){
            choiceA = 2;
            rockA.setForeground(Color.BLACK);
            paperA.setForeground(Color.BLUE);
            scissorA.setForeground(Color.BLACK);
        }
        if(e.getSource() == scissorA){
            choiceA = 3;
            rockA.setForeground(Color.BLACK);
            paperA.setForeground(Color.BLACK);
            scissorA.setForeground(Color.BLUE);
        }

        Random rand = new Random();
        choiceC = rand.nextInt(3) + 1;

        if(choiceC == ROCK){
            rockC.setForeground(Color.BLUE);
            paperC.setForeground(Color.BLACK);
            scissorC.setForeground(Color.BLACK);
        }
        if(choiceC == PAPER){
            rockC.setForeground(Color.BLACK);
            paperC.setForeground(Color.BLUE);
            scissorC.setForeground(Color.BLACK);
        }
        if(choiceC == SCISSOR){
            rockC.setForeground(Color.BLACK);
            paperC.setForeground(Color.BLACK);
            scissorC.setForeground(Color.BLUE);
        }

        if(choiceA == 1 && choiceC == 3 || choiceA == 2 && choiceC == 3 || choiceA == 3 && choiceC == 1){
            message.setText("You Won!");
            scoreN++;
        }
        if(choiceA == 1 && choiceC == 1 || choiceA == 2 && choiceC == 2 || choiceA == 3 && choiceC == 3){
            message.setText("It's A Draw");
        }
        if(choiceA == 1 && choiceC == 2 || choiceA == 2 && choiceC == 1 || choiceA == 3 && choiceC == 2){
            message.setText("You Lost!");
            scoreA++;
        }
        String str = String.format("Your Score: %d \nComputer Score: ‰d", scoreN, scoreA);
        score.setText(str);
    }

    public static void main(String[] args){
        new RPS2();
    }
}
