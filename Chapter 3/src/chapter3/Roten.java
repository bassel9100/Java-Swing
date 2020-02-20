package chapter3;

public class Roten {

    public static double abs(double x){
        if(x > 0)
            return x;
        else
            return -x;
    }

    public static double sqrt(double x){
        double g = x;
        double h = x / 2;
        while(abs(g-h) >= 1e-6){
            g = h;
            h = (g + x/g)/2;
        }
        return h;
    }
}
