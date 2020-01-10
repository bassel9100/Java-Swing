import javax.swing.*;
import java.util.*;
import static java.lang.Math.*;

public class Random {

    public static boolean equal(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length)
            return false;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr2[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        double x = E;
        double y = PI;
    }
}
