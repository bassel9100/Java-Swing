import java.util.LinkedList;
import java.util.List;

public abstract class Owner {

    private List<Legal> ls = new LinkedList<>();

    public final void buy(Legal l){
        if(!ls.contains(l))
            ls.add(l);
    }

    public void sell(Legal l){
        if(ls.indexOf(l) >= 0)
            ls.remove(l);
    }

    public Legal getLegalNr(int n){
        if(n > 0 && n < ls.size())
            return ls.get(n);
        else
            return null;
    }

    public int legalCount(){
        return ls.size();
    }

    public void printLegal(){
        for(Legal l : ls)
            l.print();
    }
}
