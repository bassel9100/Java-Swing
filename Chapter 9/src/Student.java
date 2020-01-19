import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    List<Subject> ls = new ArrayList<>();

    public Student(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void newSubject(Subject s){
        if(ls.indexOf(s) == -1)
            ls.add(s);
    }

    public void leaveSubject(Subject s){
        ls.remove(s);
    }
}
