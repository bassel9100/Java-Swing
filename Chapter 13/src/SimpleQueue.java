import java.util.Vector;
import java.util.List;

public class SimpleQueue {
    private List<Object> ls = new Vector<>();

    public int size(){
        return ls.size();
    }

    public synchronized void put(Object obj){
        ls.add(obj);
        notify();
    }

    public synchronized Object take(){
        while(ls.isEmpty()){
            try{
                wait();
            } catch (InterruptedException e){
                return null;
            }
        }
        Object obj = ls.get(0);
        ls.remove(0);
        return obj;
    }
}
