import java.util.*;

public class Change {
    public static void main(String[] args){
        int hundred, fifty, twenty, five, one;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total price\n"); System.out.flush();
        int price = sc.nextInt();
        System.out.print("Paid amount\n");
        int paid = sc.nextInt();
        int change = paid - price;

        hundred = change / 100;
        change %= 100;
        fifty = change / 50;
        change %= 50;
        twenty = change / 20;
        change %= 20;
        five = change / 5;
        change %= 5;
        one = change;

        System.out.println("Hundreds:   " + hundred);
        System.out.println("Fifties:    " + fifty);
        System.out.println("Twenties:   " + twenty);
        System.out.println("Fives:      " + five);
        System.out.println("Ones:       " + one);

    }
}
