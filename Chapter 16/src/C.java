import java.util.List;

public class C {
    public static <T> void swap (Pair<T, T> p){
        T temp = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(temp);
    }

    public static <T,S> Pair<S,T> reversePair(Pair<T,S> p){
        return new Pair<S,T>(p.getSecond(), p.getFirst());
    }

    public static void printList(List<?> l){
        for(Object o : l){
            System.out.println(o);
        }
    }
}
