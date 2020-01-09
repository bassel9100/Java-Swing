public class Counter {
    private int counter;
    private int max;
    private int min;

    public Counter(int counter, int max, int min){
        this.max = max;
        this.min = min;
        if(counter > max || counter < min)
            System.out.println("Wrong counter value, setting counter to minimum value");
            this.counter = min;
        this.counter = counter;
    }

    public Counter(int counter){
        this(counter, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public void increase(){
        if(counter < max)
            counter++;
        else
            System.out.println("Counter at maximum value");
    }

    public void decrease(){
        if(counter > min)
            counter--;
        else
            System.out.println("Counter at minimum value");
    }

    public int getCounter() {
        return counter;
    }
}