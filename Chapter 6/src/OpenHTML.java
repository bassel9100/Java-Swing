import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

public class OpenHTML extends JFrame implements HyperlinkListener{
    private JEditorPane page = new JEditorPane();
    //private JScrollPane sp = new ScrollPane(page);

    public OpenHTML(String adr) throws IOException{
        if(!adr.startsWith("http://") && !adr.startsWith("file:")){
            if(adr.startsWith("www"))
                adr = "http://" + adr;
            else
                adr = "file:" + adr;
            page.setPage(adr);
            //setContentPane(sp);
            page.setEditable(false);
            page.addHyperlinkListener(this);
            setSize(700,500);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }

    public void hyperlinkUpdate(HyperlinkEvent e){
        if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
            try{
                page.setPage(e.getURL()); //Shows the new page
            } catch(IOException ie){}
    }

    public static void main(String[] args) throws IOException{
        String s = JOptionPane.showInputDialog("Enter URL");
        new OpenHTML(s);
    }
}
