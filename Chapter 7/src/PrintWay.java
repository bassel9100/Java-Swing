import java.awt.*;
import javax.swing.*;

public class PrintWay extends JFrame {

    public PrintWay(String message, int x){
        setLayout(new GridLayout(x,1));
        for(int i = 0; i < x; i++)
            add(new JLabel(message, JLabel.CENTER));
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        int n;
        if(args.length < 2){
            n = 1;
        } else{
            n = Integer.parseInt(args[1]);
        }
        new PrintWay(args[0], n);
    }
}
