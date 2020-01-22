import java.util.LinkedList;
import java.util.List;

public class Kurs {
    private String name;
    private List<Student> ls = new LinkedList<>();

    public void addStudent(Student s){
        if(!ls.contains(s))
            ls.add(s);
    }

    public void leaveStudent(Student s){
        if(ls.indexOf(s) >= 0)
            ls.remove(s);
    }
}
