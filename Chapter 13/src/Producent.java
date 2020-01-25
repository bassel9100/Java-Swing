public class Producent implements Runnable {
    public Thread activity = new Thread(this);
    private String text;
    private long duration;
    private SimpleQueue q;

    public Producent(String text, long duration, SimpleQueue q){
        this.text = text;
        this.duration = duration * 1000;
        this.q = q;
    }

    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(duration);
                q.put(text);
            } catch(InterruptedException e){
                break;
            }
        }
    }
}
