import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel{

    private int min, max, value;

    public Circle(int min, int max){
        if(min > max)
            System.out.println("Minimum value cannot be greater than maximum value");
        else {
            this.min = min;
            this.max = max;
            setBackground(Color.WHITE);
        }
    }

    public Circle(){
        this(0,100);
    }

    public void setValue(int x){
        if(value > max || value < min)
            System.out.println("Incorrect value, cannot be smaller or greater than the minimum and maximum values");
        else
            value = x;
        repaint();
    }

    public int getValue() {
        return value;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
    }
}
