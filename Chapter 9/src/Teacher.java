public class Teacher extends Person {
    Subject s1, s2, s3, s4, s5;
    int totalSubjects;

    public Teacher(String name, String address, int age){
        this.name = name;
    }

    public void newSubject(Subject s){
        if(totalSubjects == 5) {
            System.out.println("The maximum subjects a teacher can have is 5");
            return;
        }
        totalSubjects++;
        if (s1 == null)
            s1 = s;
        else if (s2 == null)
            s2 = s;
        else if (s3 == null)
            s3 = s;
        else if (s4 == null)
            s4 = s;
        else if (s5 == null)
            s5 = s;
    }

    public void leaveSubject(Subject s){
        if(totalSubjects == 0){
            System.out.println("This teacher doesn't have any subjects yet");
            return;
        }
        totalSubjects--;
        if(s1 == s)
            s1 = null;
        else if (s2 == s)
            s2 = null;
        else if (s3 == s)
            s3 = null;
        else if (s4 == s)
            s4 = null;
        else if (s5 == s)
            s5 = null;
        else{
            System.out.println("Subject not found");
            totalSubjects++;
            return;
        }
    }
}
