import java.io.*;
import java.util.*;

public class Temperature {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("temp.txt"));
        int max = -50;
        int total = 0, current;
        int n = 0;

        while(sc.hasNext()){
            current = sc.nextInt();
            if(max < current)
                max = current;
            total += current;
            n++;
        }

        System.out.printf("The highest recorded temperature was: %d and the median temperature for all days is %d", max, (total/n));
    }
}
