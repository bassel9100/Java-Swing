import java.util.ArrayList;
import java.util.List;
import java.io.*;

public abstract class Fordon {
    public abstract void init();
    public abstract void skriv();

    public static List<Fordon> skapaLista(){
        List<Fordon> ls = new ArrayList<>();
        Console c = System.console();
        while(true){
            System.out.println("Typ av fordon?");
            String typ = c.readLine();
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
}