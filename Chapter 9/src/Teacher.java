import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    List<Subject> ls = new ArrayList<>();
    Subject s1, s2, s3, s4, s5;
    int totalSubjects;

    public Teacher(String name, String address, int age){
        this.name = name;
    }

    public void newSubject(Subject s){
        if(ls.indexOf(s) == -1)
            ls.add(s);
    }

    public void leaveSubject(Subject s){
        ls.remove(s);
    }
}
