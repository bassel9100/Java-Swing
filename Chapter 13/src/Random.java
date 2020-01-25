import java.util.*;

public class Random {
    public static void main(String[] args) throws InterruptedException{
        SimpleQueue q = new SimpleQueue();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many producents?\n"); System.out.flush();
        Producent[] p = new Producent[sc.nextInt()];
        for(int i = 0; i < p.length ; i++){
            System.out.println("Producent nr: " + (i+1));
            System.out.println("Time Duration? ");
            long time = sc.nextLong();
            System.out.print("Text?"); System.out.flush();
            String str = sc.next();
            p[i] = new Producent(str, time, q);
        }
        System.out.print("How many konsumenter?"); System.out.flush();
        Konsument[] k = new Konsument[sc.nextInt()];
        for(int j = 0; j < k.length; j++){
            System.out.println("Konsument nr: " + (j+1));
            System.out.println("Time Duration? ");
            long time = sc.nextLong();
            k[j] = new Konsument(time, q);
        }

        //Start the threads
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for(int i = 0; i < p.length ; i++)
            p[i].activity.start();
        for(int i = 0; i < k.length ; i++)
            k[i].activity.start();
        Thread.sleep(50000);
        System.out.println(" Remaining in queue: " + q.size());
    }
}
