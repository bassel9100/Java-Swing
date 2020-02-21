public class Run {

    public static void main(String[] arr){
        AnimalPrinter p1 = new AnimalPrinter();
        NumberPrinter p2 = new NumberPrinter();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
            t1.start();
            t2.start();
    }
}
