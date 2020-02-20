public class Agent {
    protected String name;
    protected double sum;

    private static final double limit = 50000;
    private static final double percent1 = 0.1;
    private static final double percent2 = 0.15;

    public Agent(String name){
        this.name = name;
    }

    public double commission(){
        if(sum <= limit)
            return sum * percent1;
        else
            return (limit * percent1) + ((sum-limit) * percent2);
    }
}
