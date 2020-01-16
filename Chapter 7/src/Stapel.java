import javax.swing.*;
import java.awt.*;

public class Stapel extends JPanel {
    private boolean vertical;
    double percent = 0;

    public Stapel(boolean x){
        vertical = x;
        setBackground(Color.WHITE);
    }

    public void setPercent(double x){
        if(x < 0 || x > 100){
            System.out.println("Wrong input value, percent cannot be less than 0 or greater than 100");
        } else
            percent = x;
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(vertical){
           int height = (int) (getHeight() * (percent/100));
           g.fillRect(0, getHeight()-height, getWidth(), height);
        } else{
            int width = (int) (getWidth() * (percent/100));
            g.fillRect(0,0, width, getHeight());
        }
    }
}
