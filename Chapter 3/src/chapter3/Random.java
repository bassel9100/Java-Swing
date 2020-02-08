package chapter3;

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

    public static void rotation(int[] arr){
        int temp = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i-- )
            arr[i+1] = arr[i];
        arr[0] = temp;
    }

    public static double vectorLength(List<Integer> ls){
        double sum = 0;
        for(double x : ls){
            sum = sum + Math.pow(x,2);
        }
        return Math.sqrt(sum);
    }

    public static void main(String[] args){
        double x = E;
        double y = PI;
    }
}