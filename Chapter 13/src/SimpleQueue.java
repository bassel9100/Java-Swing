import java.util.Vector;
import java.util.List;

public class SimpleQueue {
    private List<QueueObject> ls = new Vector<>();

    public int size(){
        return ls.size();
    }

    public synchronized void put(Object obj){
        int p = Thread.currentThread().getPriority();
        int i;
        for(i = ls.size()-1; i >= 0 && p > (ls.get(i)).prio; i--); //loop as long as i is bigger than zero and that
        ls.add(i+1, new QueueObject(obj, p));               // current threads priority is higher than previous
        notify();                                                  // priority from QueueObject in list
    }

    public synchronized Object take(){
        while(ls.isEmpty()){
            try{
                wait();
            } catch (InterruptedException e){
                return null;
            }
        }
        QueueObject e = ls.get(0);
        ls.remove(0);
        return e.obj;
    }
}
