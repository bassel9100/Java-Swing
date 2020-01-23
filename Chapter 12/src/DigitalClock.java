import java.time.*;
import java.time.format.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DigitalClock extends JLabel implements ActionListener {
    private ZoneId z = ZoneId.systemDefault();
    private DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");

    public DigitalClock(){
        setHorizontalAlignment(JLabel.CENTER);
        setOpaque(true);
        setBackground(Color.lightGray);
        setFont(new Font("Sans Serif", Font.BOLD, 24));
        Timer tim = new Timer(1000,this);
        tim.start();
    }

    public DigitalClock(String zone){
        this();
        z = ZoneId.of(zone);
    }

    public void actionPerformed(ActionEvent e){
        setText(ZonedDateTime.now(z).format(f));
    }
}
