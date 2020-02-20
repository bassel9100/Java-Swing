public class Pair <T1,T2> {
    private T1 first;
    private T2 second;

    public Pair(){};

    public Pair(T1 x1, T2 x2){
        first = x1;
        second = x2;
    }

    public void setFirst(T1 x1){
        first = x1;
    }

    public void setSecond(T2 x2){
        second = x2;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}

