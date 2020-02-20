import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Random {
    public static void main(String[] args){


        Pair<Integer, Double> intls = new Pair<>(3,1.6);

        System.out.println(intls.getFirst() + intls.getSecond());

        List<String> ls = new ArrayList<>();
        List<Object> lo;

        List<Pair<Integer, Integer>> lss = new LinkedList<>();

        Pair<Double, Integer> lz = (C.reversePair(intls));
        C.printList(lss);
    }
}
