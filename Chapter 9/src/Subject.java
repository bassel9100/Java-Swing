import java.util.*;

public class Subject {
    String courseName;
    int courseCode;
    Teacher t;
    List<Student> ls = new ArrayList<>();

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void newStudent(Student t){
        if(ls.indexOf(t) == -1)
            ls.add(t);
    }

    public void leaveStudent(Student t){
        ls.remove(t);
    }
}
