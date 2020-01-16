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
        Insets i = getInsets();
        int width = getWidth()-i.left-i.right;
        int height = getHeight()-i.top-i.bottom;
        int diameter = Math.min(width,height);
        int x = i.left + (width-diameter)/2;
        int y = i.top + (height-diameter)/2;
        double part = (double) (value-min) / (max-min);
        int filledPart = (int) (part * 360 + 0.5);
        g.fillArc(x, y, diameter, diameter, 90, -filledPart);
    }
}
