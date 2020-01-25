import java.awt.event.*;
import java.awt.*;

public class Remainder implements ActionListener {
    private String text;

    public Remainder(String txt, int time){
        text = txt;
        new javax.swing.Timer(time*1000, this).start();
    }

    public void actionPerformed(ActionEvent e){
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Time to take medication " + text); System.out.flush();
    }
}
