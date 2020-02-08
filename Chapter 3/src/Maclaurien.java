import java.util.*;

public class Maclaurien {

    public static int factorial(int x){
        int sum = 1;
        while(x > 0) {
            sum *= x;
            x--;
        }
        return sum;
    }

    public static double abs(double x){
        if(x < 0)
            return -x;
        else
            return x;
    }

    public static double sin(double x){
        double sum = 0;
        double term = 1;
        int k = 1;
        while(abs(term) >= 10e-5){
            sum += term;
            k += 2;
            term = -term*x*x/(k-1)/k;
        }
        return sum;
    }

    void program(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you sin value :> ");
        System.out.println(sin(sc.nextDouble()));
    }

    public static void main(String[] args){
        new Maclaurien().program();
    }
}
