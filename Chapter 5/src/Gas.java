import java.io.*;
import java.util.*;

public class Gas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner("log.txt");

        Double gas = sc.nextDouble();
        String date = sc.next();
        String time = sc.next();
        String cardNr = sc.next();

        double total = gas;

        System.out.printf("First time point: %04d %s %s %s", gas, date, time, cardNr);
        while(sc.hasNext()){
             gas = sc.nextDouble();
             total += gas;
             date = sc.next();
             time = sc.next();
             cardNr = sc.next();
        }
        System.out.printf("Last time point: %04d %s %s %s", gas, date, time, cardNr);
        System.out.printf("Total amount gas ", total);
    }
}