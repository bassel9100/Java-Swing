import java.util.*;

public class carUsage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double milageCurrent = sc.nextDouble();
        double milageOld = sc.nextDouble();
        double usedGas = sc.nextDouble();

        System.out.printf("Total milage:    %08.2f\n", milageCurrent-milageOld);
        System.out.printf("Total gas used:  %08.2f\n", usedGas);
        System.out.printf("Total gas usage: %02.2f", usedGas/(milageCurrent-milageOld));
    }
}