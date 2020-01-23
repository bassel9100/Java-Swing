import javax.swing.*;
import java.awt.event.*;

public class MouseClick extends JFrame {

    public MouseClick(){
        getContentPane().addMouseListener(l);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    MouseListener l = new MouseAdapter() {
    @Override
        public void mouseClicked(MouseEvent e){
        String clickCount;
        if(e.getClickCount() == 1)
            clickCount = "Single Click";
        else if(e.getClickCount() == 2)
            clickCount = "Double Click";
        else
            clickCount = "Multiple Clicks";
        String button = "";
        if(SwingUtilities.isLeftMouseButton(e))
            button = "Left Button";
        else if(SwingUtilities.isRightMouseButton(e))
            button = "Right Button";
        else if(SwingUtilities.isMiddleMouseButton(e))
            button = "Middle Button";
        System.out.println(clickCount + " with " + button + " in (" + e.getX() + "." + e.getY() + ")");
        if(e.isAltDown())
            System.out.println(" ALT is pressed");
        if(e.isShiftDown())
            System.out.println(" SHIFT is pressed");
        if(e.isControlDown())
            System.out.println( "CNTRL is pressed");
        else if(e.isMetaDown())
            System.out.println( "META pressed");
        }
    };

    public static void main(String[] args){ new MouseClick(); }
}
