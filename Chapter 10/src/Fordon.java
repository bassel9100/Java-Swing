import java.util.ArrayList;
import java.util.List;
import java.io.*;

import static java.lang.System.out;

public abstract class Fordon {
    public abstract void init();
    public abstract void skriv();

    public List<Fordon> skapaList(){
        List<Fordon> ls = new ArrayList<>();
        Console c = System.console();
        while(true){
            String typ = c.readLine("Typ av fordon?");
            if(typ == null)
                 break;
            try{
                Object obj = Class.forName(typ).newInstance();
                if(obj instanceof Fordon) {
                    Fordon f = (Fordon) obj;
                    f.init();
                    ls.add(f);
                } else
                    c.printf("Not a fordon!");
            } catch(Exception e){
                c.printf("Error");
            }
        }
        return ls;
    }

    public void sayWhat(){
        out.println("SAYYYY WHAAATTTTT???");
    }
}