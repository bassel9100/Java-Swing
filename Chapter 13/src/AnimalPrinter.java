import java.util.LinkedList;
import java.util.List;

public class AnimalPrinter implements Runnable {
    String name;
    List<String> ls;
    int i = 0;

    public AnimalPrinter(){
        ls = new LinkedList<>();
        ls.add("Cat");
        ls.add("Dog");
        ls.add("Fox");
        ls.add("Iguana");
        ls.add("Bird");
        ls.add("Dinosaur");
        ls.add("Koala");
        ls.add("Squirrel");
        ls.add("Snake");
        ls.add("Shark");
    }

    @Override
    public synchronized void run() {
        while(i < 100){
            System.out.println(ls.get((int) (Math.random() * 10)));
            i++;
        }
    }
}
