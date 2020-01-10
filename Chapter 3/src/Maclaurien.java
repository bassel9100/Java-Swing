public class Maclaurien {

    public static double factorial(double x){
        double sum = 1;
        while(x > 0)
            sum *= x--;
        return sum;
    }

    public static double abs(double x){
        if(x > 0)
            return x;
        return -x;
    }

    public static double sin(double x){
        int k = 1;
        double term = x;
        double sum = 0;

        while(abs(term) >= 1.0e-5){
            sum += term;
            k += 2;
            term = -(Math.pow(term,k))/factorial(k);
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sin(2));
    }
}
