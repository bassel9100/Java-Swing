public class NumberPrinter implements Runnable {
    int j = 0;

    @Override
    public synchronized void run() {
        while(j < 100) {
            System.out.println(((int) (Math.random() * 10)));
            j++;
        }
    }
}
