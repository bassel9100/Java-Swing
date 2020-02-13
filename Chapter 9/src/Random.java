import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Random extends JFrame {
    TicTacToe t1 = new TicTacToe();

    public void Random(){
        t1.placeSign('x', 0,0);
        t1.placeSign('x', 0,1);
        t1.placeSign('o', 0,2);
        setLayout(new FlowLayout());
        add(t1);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){ new Random();}
}