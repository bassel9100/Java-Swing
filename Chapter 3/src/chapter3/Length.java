package chapter3;

import java.util.*;

public class Length {

    public double length(List<Double> ls){
        double sum = 0;
       for(Double x : ls)
           sum += x * x;
        return Math.sqrt(sum);
    }
}
