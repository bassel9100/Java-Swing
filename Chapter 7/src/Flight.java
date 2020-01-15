import javax.swing.*;
import java.awt.*;

public class Flight extends JPanel{
    private String no, destination, comment = "";
    private TimePoint dep, arr;
    private JLabel noL, destinationL, depL, commentL = new JLabel(comment);

    public Flight(String noX, String destinationX, int depHour, int depMin, int arrHour, int arrMin){
        no = noX;
        destination = destinationX;
        dep = new TimePoint(depHour, depMin);
        arr = new TimePoint(arrHour, arrMin);
        noL = new JLabel(no);
        destinationL = new JLabel(destination);
        depL = new JLabel(dep.toString());
        setLayout(new GridLayout(1,4));
        add(noL); add(destinationL); add(depL); add(commentL);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(400,25));
    }

    public void setComment(String commentX){
        comment = commentX;
        commentL.setText(comment);
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        noL.setForeground(getForeground());
        destinationL.setForeground(getForeground());
        depL.setForeground(getForeground());
        commentL.setForeground(getForeground());
    }

    public String getNo(){
        return no;
    }

    public String getDestination(){
        return destination;
    }

    public TimePoint getDeparture(){
        return new TimePoint(dep.getHour(), dep.getMin());
    }

    public TimePoint getArrival(){
        return new TimePoint(arr.getHour(), arr.getMin());
    }

    public void delay(int minutes){
        dep.tick(minutes);
        arr.tick(minutes);
        setComment("Delayed by " + minutes + " minutes");
    }

    @Override
    public String toString(){
        return no + " " + destination + " " + dep.toString() + " " + comment;
    }
}