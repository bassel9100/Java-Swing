public class Account {
    private static double interest;

    public static double getInterest(){
        return interest;
    }

    public static void changeInterest(double new_interest){
        interest = new_interest;
    }

    private int accountNr;
    private double balance, gottenInterest;

    public Account(int accountNr){
        this.accountNr = accountNr;
    }

    public double returnBalance(){
        return balance;
    }

    public void transaction(double amount){
        if(amount<0 && amount + balance < 0)
            System.out.println("Insufficient funds");
        else
            balance += amount;
    }

    public void todayInterest(){
        gottenInterest +=  balance*interest/100/365;
    }
}
