import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPS extends JFrame implements ActionListener{
    private JButton rock = new JButton("Rock");
    private JButton paper = new JButton("Paper");
    private JButton scissors = new JButton("Scissors");

    private JButton rockC = new JButton("Rock");
    private JButton paperC = new JButton("Paper");
    private JButton scissorsC = new JButton("Scissors");

    private JLabel winner = new JLabel(" ", JLabel.CENTER);
    private JLabel score = new JLabel(" ", JLabel.CENTER);

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    private int winnerT, loserT = 0;

    public RPS(){
        p1.setLayout(new GridLayout(3,1));
        p1.add(rock); p1.add(paper); p1.add(scissors);

        p2.setLayout(new GridLayout(3,1));
        p2.add(rockC); p2.add(paperC); p2.add(scissorsC);

        p3.setLayout(new GridLayout(1,2));
        p3.add(winner); p3.add(score);

        getContentPane().setBackground(Color.lightGray);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.EAST);
        add(p3, BorderLayout.SOUTH);

        rock.addActionListener(this);
        paper.addActionListener(this);
        scissors.addActionListener(this);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        int choice = 0;
        final int ROCK = 0, PAPER = 1, SCISSORS = 2;
        if(e.getSource() == rock){
            choice = ROCK;
            rock.setBackground(Color.BLUE);
            paper.setBackground(Color.LIGHT_GRAY);
            scissors.setBackground(Color.LIGHT_GRAY);
        } else if(e.getSource() == paper){
            choice = PAPER;
            rockC.setBackground(Color.LIGHT_GRAY);
            paper.setBackground(Color.BLUE);
            scissors.setBackground(Color.LIGHT_GRAY);
        } else if(e.getSource() == scissors){
            choice = SCISSORS;
            rock.setBackground(Color.LIGHT_GRAY);
            paper.setBackground(Color.LIGHT_GRAY);
            scissors.setBackground(Color.BLUE);
        }

        int choice2 = (int) (Math.random()*3);

        if(choice2 == ROCK){
            rockC.setBackground(Color.BLUE);
            paperC.setBackground(Color.LIGHT_GRAY);
            scissorsC.setBackground(Color.LIGHT_GRAY);
        }else if(choice2 == PAPER){
            rockC.setBackground(Color.LIGHT_GRAY);
            paperC.setBackground(Color.BLUE);
            scissorsC.setBackground(Color.LIGHT_GRAY);
        } else if(choice2 == SCISSORS){
            rockC.setBackground(Color.LIGHT_GRAY);
            paperC.setBackground(Color.LIGHT_GRAY);
            scissorsC.setBackground(Color.BLUE);
        }

        if (choice == choice2);
        else if (choice==ROCK && choice2==SCISSORS  ||
                choice==SCISSORS  && choice2==PAPER ||
                choice==PAPER && choice2==ROCK) {
        }
    }

    public static void main(String[] args){new RPS();}
}
