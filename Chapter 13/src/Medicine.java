import java.util.*;

public class Medicine {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("How many days are you going to take your medication?"); System.out.flush();
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        while(true){
            sc.nextLine(); //Jump to an empty line
            System.out.println("Medicine name?");
            if(!sc.hasNext())
                break;
            String name = sc.nextLine();
            System.out.println("How many pills of " + name + " are you going to need to take per day?");
            int perDay = sc.nextInt();
            new Remainder(name, 24*3600/perDay);
        }
        Thread.sleep(days*24*3600);
        System.exit(0);
    }
}
