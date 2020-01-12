import java.util.*;

public class BankInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total capital");
        double capital = sc.nextDouble();

        System.out.println("Enter interest per year");
        double interest = sc.nextDouble() / 100;

        for(int i = 0; i < 10 ; i++){
            System.out .printf("Total capital in year %d will be: %.2f\n", (i+1), (capital + (capital * interest)));
            capital = capital + (capital * interest);
        }
    }
}