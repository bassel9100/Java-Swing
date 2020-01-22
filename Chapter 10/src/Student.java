import java.util.LinkedList;
import java.util.List;

public class Student extends Person {
    protected List<Kurs> ls = new LinkedList<Kurs>();

    public Student(String name, String address, int age){
        super(name, address, age);
    }

    public void newCourse(Kurs k){
        if(!ls.contains(k)){
            ls.add(k);
        }
    }

    public void removeCourse(Kurs k){
        if(ls.indexOf(k) >= 0)
            ls.remove(k);
    }
}
