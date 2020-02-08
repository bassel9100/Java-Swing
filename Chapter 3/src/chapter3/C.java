package chapter3;

public class C {
    private static int count;
    private int id;

    public C(){
        count++;
        id = count;
    }

    public static int getCount(){
        return count;
    }

    public int getId(){
        return id;
    }
}
