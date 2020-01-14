import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class colorBox2 extends JFrame implements ListSelectionListener{
    private JLabel l1 = new JLabel("", JLabel.CENTER);
    private String[] arrColors = {"Black", "Green", "Blue", "Red", "Yellow"};
    private Color[] colors = {Color.BLACK, Color.GREEN, Color.BLUE, Color.RED, Color.YELLOW};
    private JList<String> list = new JList<>(arrColors);
    private JScrollPane scroller = new JScrollPane(list);

    public colorBox2(){
        setLayout(new FlowLayout());
        add(l1); add(scroller);
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.WHITE);
        l1.setOpaque(true);
        l1.setText("Black");
        l1.setPreferredSize(new Dimension(100,75));

        list.setVisibleRowCount(3);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent e){
        l1.setForeground(colors[list.getSelectedIndex()]);
        l1.setText(arrColors[list.getSelectedIndex()]);
    }

    public static void main(String[] args){
        colorBox2 box = new colorBox2();
    }
}
