public class Konsument implements Runnable{
    public Thread activity = new Thread(this);
    private long duration;
    private SimpleQueue q;

    public Konsument(long duration, SimpleQueue q){
        this.duration = duration * 1000;
        this.q = q;
    }

    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(duration);
                System.out.println(q.take() + " ");
            } catch(InterruptedException e){
                break;
            }
        }
    }
}
