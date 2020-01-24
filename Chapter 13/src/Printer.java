public class Printer implements Runnable {
    public Thread activity = new Thread(this);
    private String text = "";
    private long duration;

    public Printer(String str, long x){
        text = str; x = duration;
    }

    public void run(){
       // while(true)
            try {
                Thread.sleep(duration * 1000);
                System.out.println(text + " ");
            } catch (InterruptedException e) { }

    }
}
